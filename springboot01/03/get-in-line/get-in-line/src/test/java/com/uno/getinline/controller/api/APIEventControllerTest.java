package com.uno.getinline.controller.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uno.getinline.constant.ErrorCode;
import com.uno.getinline.constant.EventStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(APIEventController.class)
class APIEventControllerTest {

    private final MockMvc mvc;
    private final ObjectMapper mapper;

    public APIEventControllerTest(
            @Autowired MockMvc mvc
            , @Autowired ObjectMapper mapper) {
        this.mvc = mvc;
        this.mapper = mapper;
    }

    @DisplayName("[API][GET] 이벤트 리스트 조회")
    @Test
    void givenNothing_whenRequestingEvents_thenReturnsListOfEventsInStandardResponse() throws Exception {
        // given


        // when
        mvc.perform(get("/api/events"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.data").isArray())
                .andExpect(jsonPath("$.data[0].placeId").value(1L))
                .andExpect(jsonPath("$.data[0].eventName").value("오후 운동"))
                .andExpect(jsonPath("$.data[0].eventStatus").value(EventStatus.OPENED.name()))
                .andExpect(jsonPath("$.data[0].eventStartDateTime").value(
                        LocalDateTime.of(2021, 1, 1, 13, 0, 0)
                                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                ))
                .andExpect(jsonPath("$.data[0].eventEndDatetime").value(
                        LocalDateTime.of(2021, 1, 1, 16, 0, 0)
                                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                ))
                .andExpect(jsonPath("$.data[0].currentNumberOfPeople").value(0))
                .andExpect(jsonPath("$.data[0].capacity").value(24))
                .andExpect(jsonPath("$.data[0].memo").value("마스크 꼭 착용하세요"))
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.errorCode").value(ErrorCode.OK.getCode()))
                .andExpect(jsonPath("$.message").value(ErrorCode.OK.getMessage()));

        // then

    }
}