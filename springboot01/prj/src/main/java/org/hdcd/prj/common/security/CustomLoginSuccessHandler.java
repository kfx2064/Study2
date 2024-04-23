package org.hdcd.prj.common.security;

import org.hdcd.prj.common.security.domain.CustomUser;
import org.hdcd.prj.common.service.LoginLogService;
import org.hdcd.prj.common.util.NetUtils;
import org.hdcd.prj.domain.Member;
import org.hdcd.prj.domain.common.LoginLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomLoginSuccessHandler.class);

    @Autowired
    private LoginLogService service;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        logger.info("UserId = " + member.getUserId());

        String remoteAddr = NetUtils.getIp(request);

        logger.info("remoteAddr = " + remoteAddr);

        LoginLog loginLog = new LoginLog();

        loginLog.setUserNo(member.getUserNo());
        loginLog.setUserId(member.getUserId());
        loginLog.setRemoteAddr(remoteAddr);

        try {
            service.register(loginLog);
        } catch (Exception e) {
            e.printStackTrace();
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
