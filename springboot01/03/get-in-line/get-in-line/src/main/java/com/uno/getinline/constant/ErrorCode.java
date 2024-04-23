package com.uno.getinline.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Optional;
import java.util.function.Predicate;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public enum ErrorCode {
    OK(0, ErrorCategory.NORMAL, "Ok"),

    BAD_REQUEST(10000, ErrorCategory.CLIENT_SIDE, "bad request"),
    SPRING_BAD_REQUEST(10001, ErrorCategory.CLIENT_SIDE, "Spring-detected bad request"),

    INTERNAL_ERROR(20000, ErrorCategory.SERVER_SIDE, "internal error"),
    SPRING_INTERNAL_REQUEST(20001, ErrorCategory.SERVER_SIDE, "Spring-detected internal error")
    ;

    private Integer code;
    private ErrorCategory errorCategory;
    private String message;

    public String getMessage(Exception e) {
        return getMessage(e.getMessage());
    }

    public String getMessage(String message) {
        return Optional.ofNullable(message)
                .filter(Predicate.not(String::isBlank))
                .orElse(getMessage());
    }

    public boolean isClientSideError() {
        return this.getErrorCategory() == ErrorCategory.CLIENT_SIDE;
    }

    public boolean isServerSideError() {
        return this.getErrorCategory() == ErrorCategory.SERVER_SIDE;
    }


    @Override
    public String toString() {
        return String.format("%s (%d)", name(), this.getCode());
    }

    public enum ErrorCategory {
        NORMAL, CLIENT_SIDE, SERVER_SIDE
    }
}
