package com.fastcampus;

import com.fastcampus.javapractice.config.Config;
import com.fastcampus.javapractice.logic.Sort;
import com.fastcampus.javapractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //Sort<String> sort = context.getBean(Sort.class);

        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}