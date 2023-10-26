package org.hdcd.controller;

import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm");

        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member) {
        logger.info("register");
        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());

        return "success";
    }

    @RequestMapping(value = "/registerByGet01", method = RequestMethod.GET)
    public String registerByGet01(String userId, @DateTimeFormat(pattern = "yyyyMMdd") Date dateOfBirth) {
        logger.info("registerByGet01");
        logger.info("userId = " + userId);
        logger.info("dateOfBirth = " + dateOfBirth);

        return "success";
    }

    @RequestMapping(value = "/registerByGet02", method = RequestMethod.GET)
    public String registerByGet02(Member member) {
        logger.info("registerByGet02");
        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());

        return "success";
    }

}
