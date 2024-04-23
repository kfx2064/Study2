package org.hdcd.controller;

import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        logger.info("loginForm");

        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(String userId, String userPw, Model model) {
        logger.info("login");

        logger.info("login userId = " + userId);
        logger.info("login userPw = " + userPw);

        Member member = new Member();

        member.setUserId(userId);
        member.setUserPw(userPw);
        member.setUserName("홍길동");
        member.setEmail("hkd@aaa.com");

        model.addAttribute("user", member);
    }
}
