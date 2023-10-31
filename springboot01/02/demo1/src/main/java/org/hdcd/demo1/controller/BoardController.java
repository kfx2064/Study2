package org.hdcd.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping("/register")
    public void registerForm() {
        logger.info("registerForm : access to member");
    }

}
