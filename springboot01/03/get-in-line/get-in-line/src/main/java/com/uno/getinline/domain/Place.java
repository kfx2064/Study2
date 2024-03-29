package com.uno.getinline.domain;

import com.uno.getinline.constant.PlaceType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Place {

    private Long id;

    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    protected Place() {}

    protected Place(
            PlaceType placeType
            , String placeName
            , String address
            , String phoneNumber
            , Integer capacity
            , String memo
    ) {
        this.placeType = placeType;
        this.placeName = placeName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.capacity = capacity;
        this.memo = memo;
    }

    public static Place of(
            PlaceType placeType
            , String placeName
            , String address
            , String phoneNumber
            , Integer capacity
            , String memo
    ) {
        return new Place(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}
