package org.hdcd.controller;

import org.hdcd.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/read01", method = RequestMethod.GET)
    public String read01(Model model) {
        logger.info("read01");

        model.addAttribute("userId", "hongkd");
        model.addAttribute("password", "1234");
        model.addAttribute("email", "aaa@ccc.com");
        model.addAttribute("userName", "홍길동");
        model.addAttribute("birthDay", "1989-09-07");

        return "read01";
    }

    @RequestMapping(value = "/read02", method = RequestMethod.GET)
    public String read02(Model model) {
        logger.info("read02");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");
        member.setBirthDay("1989-09-07");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute(member);

        return "read02";
    }

    @RequestMapping(value = "/read03", method = RequestMethod.GET)
    public String read03(Model model) {
        logger.info("read03");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");
        member.setBirthDay("1989-09-07");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute("user", member);

        return "read03";
    }

    @RequestMapping(value = "/read04", method = RequestMethod.GET)
    public String read04(Model model) {
        logger.info("read04");

        String[] carArray = {"saab", "audi"};

        List<String> carList = new ArrayList<String>();
        carList.add("saab");
        carList.add("audi");

        String[] hobbyArray = {"Music", "Movie"};

        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        model.addAttribute("carArray", carArray);
        model.addAttribute("carList", carList);

        model.addAttribute("hobbyArray", hobbyArray);
        model.addAttribute("hobbyList", hobbyList);

        return "read04";
    }

    @RequestMapping(value = "/read05", method = RequestMethod.GET)
    public String read05(Model model) {
        logger.info("read05");

        Member member = new Member();

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

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

        model.addAttribute("user", member);

        return "read05";
    }

    @RequestMapping(value = "/read06", method = RequestMethod.GET)
    public String read06(Model model) {
        logger.info("read06");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");
        member.setBirthDay("1989-09-07");

        member.setGender("female");

        member.setDeveloper("Y");
        member.setForeigner(true);

        member.setNationality("Australia");
        member.setCars("saab");

        String[] carArray = {"saab", "audi"};

        member.setCarArray(carArray);

        List<String> carList = new ArrayList<String>();
        carList.add("saab");
        carList.add("audi");

        member.setCarList(carList);

        member.setHobby("Movie");

        String[] hobbyArray = {"Music", "Movie"};

        member.setHobbyArray(hobbyArray);

        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

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

        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        String introduction = "안녕하세요.\n반갑습니다.";

        member.setIntroduction(introduction);

        model.addAttribute("user", member);

        return "read01";
    }

}
