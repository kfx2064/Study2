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

	@ResponseBody
	@RequestMapping(value = "/goHome1101", method = RequestMethod.GET)
	public ResponseEntity<byte[]> home1101() throws Exception {
		logger.info("home1101");

		InputStream in = null;
		ResponseEntity<byte[]> entity = null;

		try {
			HttpHeaders headers = new HttpHeaders();

			in = new FileInputStream("C:\\Temp\\sample.png");

			headers.setContentType(MediaType.IMAGE_PNG);

			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}
		return entity;
	}

	@ResponseBody
	@RequestMapping(value = "/goHome1102", method = RequestMethod.GET)
	public ResponseEntity<byte[]> home1102() throws Exception {
		logger.info("home1102");

		String fileName = "sample.png";

		InputStream in = null;
		ResponseEntity<byte[]> entity = null;

		try {
			HttpHeaders headers = new HttpHeaders();

			in = new FileInputStream("C:\\Temp\\" + fileName);

			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.add("Content-Disposition", "attachment; filename=\""
					+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");

			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}

		return entity;
	}

}
