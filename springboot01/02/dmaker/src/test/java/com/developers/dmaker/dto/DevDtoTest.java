package com.developers.dmaker.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class DevDtoTest {

    @Test
    void test() {
        DevDto devDto = DevDto.builder()
                .firstName("snow")
                .age(21)
                .startAt(LocalDateTime.now())
                .experienceYears(3)
                .build();

        System.out.println(devDto);
        devDto.printLog();
    }
}
