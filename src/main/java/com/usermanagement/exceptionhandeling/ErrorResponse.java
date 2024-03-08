package com.usermanagement.exceptionhandeling;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    private HttpStatus httpStatus;

    private LocalDateTime localDateTime;

    private String message;

    public ErrorResponse(){
        localDateTime = LocalDateTime.now();
    }

    public ErrorResponse(HttpStatus status){
        this.httpStatus = status;
    }
}
