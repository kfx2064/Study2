package org.hdcd.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeCheckerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(TimeCheckerAdvice.class);

    @Around("execution(* org.hdcd.service.BoardService*.*(..))")
    public void log(JoinPoint jp) throws Throwable {

        Object targetObject = jp.getTarget();

        logger.info("targetObject = " + targetObject);

        Object thisObject = jp.getThis();

        logger.info("thisObject = " + thisObject);

        Object[] args = jp.getArgs();

        logger.info("args.length = " + args.length);
    }
}
