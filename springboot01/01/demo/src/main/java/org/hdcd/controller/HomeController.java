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
		Member member = new Member();

		model.addAttribute(member);

		return "home0101";
	}

	@RequestMapping(value = "/home0102", method = RequestMethod.GET)
	public String home0102(Model model) {
		Member member = new Member();
		member.setForeigner(true);

		model.addAttribute(member);

		return "home0102";
	}

	@RequestMapping(value = "/home0103", method = RequestMethod.GET)
	public String home0103(Model model) {
		Member member = new Member();
		member.setForeigner(false);

		model.addAttribute(member);

		return "home0103";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		Member member = new Member();

		model.addAttribute(member);

		return "home0201";
	}

	@RequestMapping(value = "/home0202", method = RequestMethod.GET)
	public String home0202(Model model) {
		Member member = new Member();
		member.setGender("F");

		model.addAttribute(member);

		return "home0201";
	}

	@RequestMapping(value = "/home0203", method = RequestMethod.GET)
	public String home0203(Model model) {
		Member member = new Member();
		member.setGender("M");

		model.addAttribute(member);

		return "home0201";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		Member member = new Member();

		String[] hobbyArray = {"Music", "Movie"};

		member.setHobbyArray(hobbyArray);

		model.addAttribute(member);

		return "home0301";
	}

	@RequestMapping(value = "/home0302", method = RequestMethod.GET)
	public String home0302(Model model) {
		Member member = new Member();

		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");

		member.setHobbyList(hobbyList);

		model.addAttribute(member);

		return "home0302";
	}

	@RequestMapping(value = "/home0303", method = RequestMethod.GET)
	public String home0303(Model model) {
		Member member = new Member();

		List<Card> cardList = new ArrayList<Card>();

		Card card1 = new Card();
		card1.setNo("123456");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 8);

		card1.setValidMonth(cal.getTime());

		cardList.add(card1);

		Card card2 = new Card();
		card2.setNo("456786");

		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 7);

		card2.setValidMonth(cal.getTime());

		cardList.add(card2);

		member.setCardList(cardList);

		model.addAttribute(member);

		return "home0303";
	}

	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0401";
	}

	@RequestMapping(value = "/home0402", method = RequestMethod.GET)
	public String home0402(Model model) {
		Member member = new Member();

		member.setUserId("hongkd");

		model.addAttribute(member);

		return "home0402";
	}

}
