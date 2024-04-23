package com.uno.getinline.dto;

import com.uno.getinline.constant.EventStatus;

import java.time.LocalDateTime;

public record EventRequest(
        Long id
        , String eventName
        , EventStatus eventStatus
        , LocalDateTime eventStartDatetime
        , LocalDateTime eventEndDatetime
        , Integer currentNumberOfPeople
        , Integer capacity
        , String memo
) {
    public static EventRequest of(
            Long id
            , String eventName
            , EventStatus eventStatus
            , LocalDateTime eventStartDatetime
            , LocalDateTime eventEndDatetime
            , Integer currentNumberOfPeople
            , Integer capacity
            , String memo
    ) {
        return new EventRequest(
                id
                , eventName
                , eventStatus
                , eventStartDatetime
                , eventEndDatetime
                , currentNumberOfPeople
                , capacity
                , memo
        );
    }

    public EventDto toDto(PlaceDto placeDto) {
        return EventDto.of(
                this.id()
                , placeDto
                , this.eventName()
                , this.eventStatus()
                , this.eventStartDatetime()
                , this.eventEndDatetime()
                , this.currentNumberOfPeople()
                , this.capacity()
                , this.memo()
                , null
                , null
        );
    }
}
