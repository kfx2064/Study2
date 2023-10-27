package org.hdcd.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.*;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.io.IOUtils;
import org.hdcd.domain.Address;
import org.hdcd.domain.Card;
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

import javax.jws.WebParam;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("msg", "Hello world!");

		return "home";
	}

	@RequestMapping(value = "/home0101", method = RequestMethod.GET)
	public String home0101(Model model) {
		model.addAttribute("username", "Sebastian");

		return "home0101";
	}

	@RequestMapping(value = "/home0102", method = RequestMethod.GET)
	public String home0102(Model model) {
		model.addAttribute("username", "<b>Sebastian</b>");

		return "home0102";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		model.addAttribute("username", "<b>Sebastian</b>");

		return "home0201";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		model.addAttribute("username", "Sebastian");

		return "home0301";
	}

	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		model.addAttribute("username", "Sebastian");

		return "home0401";
	}

}
