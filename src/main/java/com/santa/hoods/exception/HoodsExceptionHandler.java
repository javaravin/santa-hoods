package com.santa.hoods.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class HoodsExceptionHandler {
    @ExceptionHandler(InvalidRequest.class)
    public ResponseEntity invalidRequest(InvalidRequest invalidRequest){
        return ResponseEntity.badRequest().body(Map.of("error",invalidRequest.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity invalidRequest(RuntimeException runtimeException){
        return ResponseEntity.badRequest().body(Map.of("error","Something went wrong please contact admin"));
    }
}
