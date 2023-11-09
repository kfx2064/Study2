package com.uno.getinline.domain;

import lombok.Data;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {

    private Long id;

    private Long adminId;
    private Long placeId;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
