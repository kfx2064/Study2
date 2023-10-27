package org.hdcd.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.*;

import org.apache.commons.io.IOUtils;
import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm() {
		logger.info("registerForm");

		return "registerForm";
	}

}
