package org.hdcd.controller;

import org.hdcd.domain.Board;
import org.hdcd.domain.Member;
import org.hdcd.service.BoardService;
import org.hdcd.service.MemberService;
import org.hdcd.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService service;

    @Autowired
    private MemberService memberService;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerForm(Board board, Model model) throws Exception {
        logger.info("registerForm");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated Board board, BindingResult result, Model model) throws Exception {
        logger.info("register");

        if (result.hasErrors()) {
            return "board/register";
        }

        service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "board/success";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {
        logger.info("list");

        List<Board> list = service.list();

        List<Member> mList = memberService.list();

        List<Board> bList = testService.listBoard();

        for (int i = 0; i < mList.size(); i++) {
            Member member = mList.get(i);
            System.out.println("member : " + member.toString());
        }

        for (int i = 0; i < bList.size(); i++) {
            Board board = bList.get(i);
            System.out.println("board : " + board.toString());
        }

        model.addAttribute("list", bList);
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(@RequestParam("boardNo") int boardNo, Model model) throws Exception {
        logger.info("read");

        model.addAttribute(service.read(boardNo));
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam("boardNo") int boardNo, Model model) throws Exception {
        logger.info("remove");

        service.remove(boardNo);

        model.addAttribute("msg", "삭제가 완료되었습니다.");

        return "board/success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyForm(@RequestParam("boardNo") int boardNo, Model model) throws Exception {
        logger.info("modifyForm");

        model.addAttribute(service.read(boardNo));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(Board board, Model model) throws Exception {
        logger.info("modify");

        service.modify(board);

        model.addAttribute("msg", "수정이 완료되었습니다.");

        return "board/success";
    }

}
