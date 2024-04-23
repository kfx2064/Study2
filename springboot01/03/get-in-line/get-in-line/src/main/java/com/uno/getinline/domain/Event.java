package com.uno.getinline.domain;

import com.uno.getinline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {

    private Long id;

    private Place place;
    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    protected Event() {}

    protected Event(
        Place place
        , String eventName
        , EventStatus eventStatus
        , LocalDateTime eventStartDatetime
        , LocalDateTime eventEndDatetime
        , Integer currentNumberOfPeople
        , Integer capacity
        , String memo
    ) {
        this.place = place;
        this.eventName = eventName;
        this.eventStatus = eventStatus;
        this.eventStartDatetime = eventStartDatetime;
        this.eventEndDatetime = eventEndDatetime;
        this.currentNumberOfPeople = currentNumberOfPeople;
        this.capacity = capacity;
        this.memo = memo;
    }

    public static Event of(
            Place place
            , String eventName
            , EventStatus eventStatus
            , LocalDateTime eventStartDatetime
            , LocalDateTime eventEndDatetime
            , Integer currentNumberOfPeople
            , Integer capacity
            , String memo
    ) {
        return new Event(
                place
                , eventName
                , eventStatus
                , eventStartDatetime
                , eventEndDatetime
                , currentNumberOfPeople
                , capacity
                , memo
        );
    }

}
