package org.hdcd.controller;

import org.hdcd.domain.Board;
import org.hdcd.domain.Item;
import org.hdcd.service.BoardService;
import org.hdcd.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private BoardService boardService;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/list")
    public String testList(Model model) throws Exception {
        logger.info("TestController, testList.");

        List<Board> list = testService.list();

        model.addAttribute("board", new Board());
        model.addAttribute("list", list);

        return "board/list";
    }

    @RequestMapping(value = "/test/itemList")
    public String testItemList(Model model) throws Exception {
        logger.info("TestController, testItemList.");

        List<Item> list = testService.itemList();

        model.addAttribute("itemList", list);

        return "item/list";
    }

}
