package org.hdcd.spring.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hdcd.spring.common.domain.PerformanceLog;
import org.hdcd.spring.common.service.PerformanceLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class TimeCheckerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(TimeCheckerAdvice.class);

    @Autowired
    private PerformanceLogService service;

    @Around("execution(* org.hdcd.spring.service.*Service*.*(..))")
    public Object timeLog(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.currentTimeMillis();
        logger.info(Arrays.toString(pjp.getArgs()));

        Signature signature = pjp.getSignature();
        Object target = pjp.getTarget();

        String signatureName = signature.getName();
        String signatureDeclaringTypeName = signature.getDeclaringTypeName();

        logger.info("signature.getName() = " + signatureName);
        logger.info("signature.getDeclaringTypeName() = " + signatureDeclaringTypeName);
        logger.info("target = " + target);

        Object result = pjp.proceed();

        long endTime = System.currentTimeMillis();

        long durationTime = endTime - startTime;

        logger.info(pjp.getSignature().getName() + " : " + durationTime);

        PerformanceLog performanceLog = new PerformanceLog();
        performanceLog.setSignatureName(signatureName);
        performanceLog.setSignatureTypeName(signatureDeclaringTypeName);
        performanceLog.setDurationTime(durationTime);

        service.register(performanceLog);

        return result;
    }
}
