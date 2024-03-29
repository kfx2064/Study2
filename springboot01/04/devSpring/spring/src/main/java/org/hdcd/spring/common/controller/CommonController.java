package org.hdcd.spring.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    @RequestMapping(value = "/error/errorCommon", method = RequestMethod.GET)
    public void handleCommonError() {
        logger.info("errorCommon");
    }

    @RequestMapping(value = "/error/accessError", method = RequestMethod.GET)
    public void accessDenied(Authentication auth, Model model) {
        logger.info("access Denied : " + auth);

        model.addAttribute("msg", "Access Denied");
    }
}
