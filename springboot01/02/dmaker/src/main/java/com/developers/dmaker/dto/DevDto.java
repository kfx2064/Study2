package com.developers.dmaker.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class DevDto {
    String firstName;
    Integer age;
    Integer experienceYears;
    LocalDateTime startAt;

    public void printLog() {
        log.info(getFirstName());
    }
}
