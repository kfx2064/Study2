package org.hdcd.controller;

import org.hdcd.domain.*;
import org.hdcd.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

@Controller
@RequestMapping("/user")
public class MemberController {

    @Autowired
    private MemberService service;

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerForm(Member member, Model model) throws Exception {

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member, Model model) throws Exception {
        service.register(member);

        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "user/success";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {

        List<Member> list = service.list();

        model.addAttribute("list", list);
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(int userNo, Model model) throws Exception {
        model.addAttribute(service.read(userNo));
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(int userNo, Model model) throws Exception {
        service.remove(userNo);

        model.addAttribute("msg", "삭제가 완료되었습니다.");

        return "user/success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyForm(int userNo, Model model) throws Exception {
        model.addAttribute(service.read(userNo));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(Member member, Model model) throws Exception {
        service.modify(member);

        model.addAttribute("msg", "수정이 완료되었습니다.");

        return "user/success";
    }

}
