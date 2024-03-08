package com.usermanagement.exceptionhandeling;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    private HttpStatus httpStatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd hh:mm:ss")
    private LocalDateTime localDateTime;

    private String message;


    public ErrorResponse(HttpStatus status) {
        localDateTime = LocalDateTime.now();
        this.httpStatus = status;
    }
}
