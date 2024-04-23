package com.uno.getinline.controller.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uno.getinline.service.EventService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(APIEventController.class)
class APIEventControllerTest {

    private final MockMvc mvc;
    private final ObjectMapper mapper;

    @MockBean private EventService eventService;

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
        given(eventService.getEvents(any(), any(), any(), any(), any())).willReturn(List.of(createEventDto()));

        // when & then
    }
}