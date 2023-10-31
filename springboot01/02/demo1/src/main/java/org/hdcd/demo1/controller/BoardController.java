package org.hdcd.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping("/list")
    public void list() {
        logger.info("list : access to all");
    }

    @PreAuthorize("hasRole('ROLE_MEMBER')")
    @RequestMapping("/register")
    public void registerForm() {
        logger.info("registerForm : access to member");
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/read")
    public void read() {
        logger.info("read : access to authenticated user");
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
    @RequestMapping("/modify")
    public void modifyForm() {
        logger.info("modifyForm : access to member or admin");
    }

}
