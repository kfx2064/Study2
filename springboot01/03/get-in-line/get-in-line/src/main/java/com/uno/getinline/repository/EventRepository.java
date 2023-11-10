package com.uno.getinline.repository;

import com.uno.getinline.constant.EventStatus;
import com.uno.getinline.dto.EventDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    default List<EventDto> findEvents(
            Long placeId
            , String eventName
            , EventStatus eventStatus
            , LocalDateTime eventStartDatetime
            , LocalDateTime eventEndDatetime
    ) {
        return List.of();
    }

    default Optional<EventDto> findEvent(Long eventId) {
        return Optional.empty();
    }

    default boolean insertEvent(EventDto eventDTO) {
        return false;
    }

    default boolean updateEvent(Long eventId, EventDto dto) {
        return false;
    }

    default boolean deleteEvent(Long eventId) {
        return false;
    }
}
