package org.hdcd.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/goHome0101", method = RequestMethod.GET)
	public void home0101() {
		logger.info("home0101");
	}

	@RequestMapping(value = "/sub/goHome0102", method = RequestMethod.GET)
	public void home0102() {
		logger.info("home0102");
	}

}
