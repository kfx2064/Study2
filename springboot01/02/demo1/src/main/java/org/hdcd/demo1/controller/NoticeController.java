package org.hdcd.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);

    @RequestMapping("/list")
    public void list() {
        logger.info("list : access to all");
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/register")
    public void registerForm() {
        logger.info("registerForm : access to admin");
    }

}
