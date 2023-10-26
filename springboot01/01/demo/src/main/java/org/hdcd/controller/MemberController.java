package org.hdcd.controller;

import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm");

        return "registerForm";
    }

    @RequestMapping(value = "/register01", method = RequestMethod.POST)
    public String registerByPath(Member member) {
        logger.info("register01");
        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());

        return "success";
    }

    @RequestMapping(value = "/register02", method = RequestMethod.POST)
    public String register02(Member member, int coin) {
        logger.info("register02");
        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());
        logger.info("coin = " + coin);

        return "success";
    }

    @RequestMapping(value = "/register03", method = RequestMethod.POST)
    public String register03(int uid, Member member) {
        logger.info("register03");
        logger.info("uid = " + uid);
        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());

        return "success";
    }

}
