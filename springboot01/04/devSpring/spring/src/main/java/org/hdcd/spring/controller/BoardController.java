package org.hdcd.spring.controller;

import org.hdcd.spring.common.domain.CodeLabelValue;
import org.hdcd.spring.common.domain.PageRequest;
import org.hdcd.spring.common.domain.Pagination;
import org.hdcd.spring.common.security.domain.CustomUser;
import org.hdcd.spring.domain.Board;
import org.hdcd.spring.domain.Member;
import org.hdcd.spring.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_MEMBER')")
    public void registerForm(Model model, Authentication authentication) throws Exception {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        Board board = new Board();

        board.setWriter(member.getUserId());

        model.addAttribute(board);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_MEMBER')")
    public String register(Board board, RedirectAttributes rttr) throws Exception {
        service.register(board);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(@ModelAttribute("pgrq") PageRequest pageRequest, Model model) throws Exception {
        model.addAttribute("list", service.list(pageRequest));

        Pagination pagination = new Pagination();
        pagination.setPageRequest(pageRequest);

        pagination.setTotalCount(service.count(pageRequest));

        model.addAttribute("pagination", pagination);

        List<CodeLabelValue> searchTypeCodeValueList = new ArrayList<CodeLabelValue>();
        searchTypeCodeValueList.add(new CodeLabelValue("n", "---"));
        searchTypeCodeValueList.add(new CodeLabelValue("t", "Title"));
        searchTypeCodeValueList.add(new CodeLabelValue("c", "Content"));
        searchTypeCodeValueList.add(new CodeLabelValue("w", "Writer"));
        searchTypeCodeValueList.add(new CodeLabelValue("tc", "Title OR Content"));
        searchTypeCodeValueList.add(new CodeLabelValue("cw", "Content OR Writer"));
        searchTypeCodeValueList.add(new CodeLabelValue("tcw", "Title OR Content OR Writer"));

        model.addAttribute("searchTypeCodeValueList", searchTypeCodeValueList);
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(int boardNo, @ModelAttribute("pgrq") PageRequest pageRequest,
                     Model model) throws Exception {
        /*model.addAttribute(service.read(boardNo));*/

        Board board = service.read(boardNo);

        /*board.setPageRequest(pageRequest);*/

        model.addAttribute(board);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
    public String remove(int boardNo, PageRequest pageRequest, RedirectAttributes rttr) throws Exception {
        service.remove(boardNo);

        rttr.addFlashAttribute("page", pageRequest.getPage());
        rttr.addFlashAttribute("sizePerPage", pageRequest.getSizePerPage());

        rttr.addFlashAttribute("searchType", pageRequest.getSearchType());
        rttr.addFlashAttribute("keyword", pageRequest.getKeyword());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
    public void modifyForm(int boardNo, @ModelAttribute("pgrq") PageRequest pageRequest,
                           Model model) throws Exception {
//        model.addAttribute(service.read(boardNo));

        Board board = service.read(boardNo);

        /*board.setPageRequest(pageRequest);*/

        model.addAttribute(board);
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
    public String modify(Board board, PageRequest pageRequest,
                         RedirectAttributes rttr) throws Exception {
        service.modify(board);

        rttr.addFlashAttribute("page", pageRequest.getPage());
        rttr.addFlashAttribute("sizePerPage", pageRequest.getSizePerPage());

        rttr.addFlashAttribute("searchType", pageRequest.getSearchType());
        rttr.addFlashAttribute("keyword", pageRequest.getKeyword());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/list";
    }
}
