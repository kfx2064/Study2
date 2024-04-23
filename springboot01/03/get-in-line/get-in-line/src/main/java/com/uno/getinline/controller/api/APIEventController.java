package com.uno.getinline.controller.api;

import com.uno.getinline.constant.EventStatus;
import com.uno.getinline.constant.PlaceType;
import com.uno.getinline.dto.ApiDataResponse;
import com.uno.getinline.dto.EventRequest;
import com.uno.getinline.dto.EventResponse;
import com.uno.getinline.dto.PlaceDto;
import com.uno.getinline.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class APIEventController {

    private final EventService eventService;

    @GetMapping("/events")
    public ApiDataResponse<List<EventResponse>> getEvents(
            Long placeId
            , String eventName
            , EventStatus eventStatus
            , LocalDateTime eventStartDatetime
            , LocalDateTime eventEndDatetime
    ) {
        return ApiDataResponse.of(List.of(EventResponse.of(
                1L
                , PlaceDto.of(
                        1L
                        , PlaceType.SPORTS
                        , "배드민턴장"
                        , "서울시 가나구 다라동"
                        , "010-1111-2222"
                        , 0
                        , null
                        , LocalDateTime.now()
                        , LocalDateTime.now()
                )
                , "오후 운동"
                , EventStatus.OPENED
                , LocalDateTime.of(2021, 1, 1, 13, 0, 0)
                , LocalDateTime.of(2021, 1, 1, 16, 0, 0)
                , 0
                , 24
                , "마스크 꼭 착용하세요"
        )));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/place/{placeId}/events")
    public ApiDataResponse<String> createEvent(
            EventRequest eventRequest
            , Long placeId
    ) {
        boolean result = eventService.createEvent(eventRequest.toDto(PlaceDto.idOnly(placeId)));

        return ApiDataResponse.of(Boolean.toString(result));
    }

    @GetMapping("/events/{eventId}")
    public ApiDataResponse<EventResponse> getEvent(Long eventId) {
        EventResponse eventResponse = EventResponse.from(eventService.getEvent(eventId).orElse(null));

        return ApiDataResponse.of(eventResponse);
    }

    @PutMapping("/events/{eventId}")
    public ApiDataResponse<String> modifyEvent(
            Long eventId
            , EventRequest eventRequest
    ) {
        boolean result = eventService.modifyEvent(eventId, eventRequest.toDto(null));
        return ApiDataResponse.of(Boolean.toString(result));
    }

    @DeleteMapping("/events/{eventId}")
    public ApiDataResponse<String> removeEvent(Long eventId) {
        boolean result = eventService.removeEvent(eventId);

        return ApiDataResponse.of(Boolean.toString(result));
    }

}
