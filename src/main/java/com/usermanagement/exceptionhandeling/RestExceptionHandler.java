package com.usermanagement.exceptionhandeling;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handlesNoSuchElement(HttpServletRequest request, NoSuchElementException exception){
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND);
        errorResponse.setMessage("Error occur while trying to execute URL : "+request.getRequestURI() +" Error : "+exception.getMessage()) ;
        return  buildErrorResponse(errorResponse);

    }

    private ResponseEntity<Object> buildErrorResponse(ErrorResponse errorResponse){
        return  new ResponseEntity<>(errorResponse, errorResponse.getHttpStatus());
    }
}
