package org.hdcd.spring.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.hdcd.spring.common.domain.CodeLabelValue;
import org.hdcd.spring.domain.Member;
import org.hdcd.spring.service.CodeService;
import org.hdcd.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
@RequestMapping("/user")
public class MemberController {

    @Autowired
    private MemberService service;

    @Autowired
    private CodeService codeService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerForm(Member member, Model model) throws Exception {
        String classCode = "A01";
        List<CodeLabelValue> jobList = codeService.getCodeList(classCode);

        model.addAttribute("jobList", jobList);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated Member member, BindingResult result,
                           Model model, RedirectAttributes rttr) throws Exception {
        if (result.hasErrors()) {
            String classCode = "A01";
            List<CodeLabelValue> jobList = codeService.getCodeList(classCode);

            model.addAttribute("jobList", jobList);

            return "user/register";
        }

        String inputPassword = member.getUserPw();
        member.setUserPw(passwordEncoder.encode(inputPassword));

        service.register(member);

        rttr.addFlashAttribute("userName", member.getUserName());
        return "redirect:/user/registerSuccess";
    }

    @RequestMapping(value = "/registerSuccess", method = RequestMethod.GET)
    public void registerSuccess(Model model ) throws Exception {

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void list(Model model) throws Exception {
        model.addAttribute("list", service.list());
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(int userNo, Model model) throws Exception {
        String classCode = "A01";
        List<CodeLabelValue> jobList = codeService.getCodeList(classCode);

        model.addAttribute("jobList", jobList);

        model.addAttribute(service.read(userNo));
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String remove(int userNo, RedirectAttributes rttr) throws Exception {
        service.remove(userNo);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/user/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyForm(int userNo, Model model) throws Exception {
        String classCode = "A01";
        List<CodeLabelValue> jobList = codeService.getCodeList(classCode);

        model.addAttribute("jobList", jobList);

        model.addAttribute(service.read(userNo));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(Member member, RedirectAttributes rttr) throws Exception {
        service.modify(member);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/user/list";
    }

    @RequestMapping(value = "/setup", method = RequestMethod.POST)
    public String setupAdmin(Member member, RedirectAttributes rttr) throws Exception {
        if (service.countAll() == 0) {
            String inputPassword = member.getUserPw();
            member.setUserPw(passwordEncoder.encode(inputPassword));

            member.setJob("00");

            service.setupAdmin(member);

            rttr.addFlashAttribute("userName", member.getUserName());
            return "redirect:/user/registerSuccess";
        }

        return "redirect:/user/setupFailure";
    }

    @RequestMapping(value = "/setup", method = RequestMethod.GET)
    public String setupAdminForm(Member member, Model model) throws Exception {
        if (service.countAll() == 0) {
            return "user/setup";
        }

        return "user/setupFailure";
    }

}
