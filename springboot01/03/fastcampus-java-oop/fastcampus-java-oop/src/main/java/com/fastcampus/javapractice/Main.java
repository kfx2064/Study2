package com.fastcampus.javapractice;

import com.fastcampus.javapractice.config.Config;
import com.fastcampus.javapractice.logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Hello world");
        Sort<String> sort = context.getBean(Sort.class);
        /*
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
        */
    }
}