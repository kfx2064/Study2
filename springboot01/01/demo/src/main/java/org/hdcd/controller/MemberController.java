package org.hdcd.controller;

import org.hdcd.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm");

        return "registerForm";
    }

    @RequestMapping(value = "/registerFile01", method = RequestMethod.POST)
    public String registerFile01(MultipartFile picture) throws Exception {
        logger.info("registerFile01");

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile02", method = RequestMethod.POST)
    public String registerFile02(String userId, String password, MultipartFile picture) throws Exception {
        logger.info("registerFile02");
        logger.info("userId = " + userId);
        logger.info("password = " + password);
        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile03", method = RequestMethod.POST)
    public String registerFile03(Member member, MultipartFile picture) throws Exception {
        logger.info("registerFile03");

        logger.info("userId = " + member.getUserId());
        logger.info("password = " + member.getPassword());

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile04", method = RequestMethod.POST)
    public String registerFile04(FileMember fileMember) throws Exception {
        logger.info("registerFile04");

        logger.info("userId = " + fileMember.getUserId());
        logger.info("password = " + fileMember.getPassword());

        MultipartFile picture = fileMember.getPicture();

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile05", method = RequestMethod.POST)
    public String registerFile05(MultipartFile picture, MultipartFile picture2) throws Exception {
        logger.info("registerFile05");

        logger.info("picture originalName: " + picture.getOriginalFilename());
        logger.info("picture size: " + picture.getSize());
        logger.info("picture contentType: " + picture.getContentType());

        logger.info("picture2 originalName: " + picture2.getOriginalFilename());
        logger.info("picture2 size: " + picture2.getSize());
        logger.info("picture2 contentType: " + picture2.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile06", method = RequestMethod.POST)
    public String registerFile06(List<MultipartFile> pictureList) throws Exception {
        logger.info("registerFile06");

        logger.info("registerFile06 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " + picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }

    @RequestMapping(value = "/registerFile07", method = RequestMethod.POST)
    public String registerFile07(MultiFileMember multiFileMember) throws Exception {
        logger.info("registerFile07");

        List<MultipartFile> pictureList = multiFileMember.getPictureList();

        logger.info("registerFile07 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " +picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }

    @RequestMapping(value = "/registerFile08", method = RequestMethod.POST)
    public String registerFile08(MultipartFile[] pictureList) throws Exception {
        logger.info("registerFile08");

        logger.info("registerFile08 pictureList.length = " + pictureList.length);

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " + picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }
}
