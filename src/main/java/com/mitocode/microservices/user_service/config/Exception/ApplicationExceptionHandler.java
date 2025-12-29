package com.mitocode.microservices.user_service.config.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({NullPointerException.class})
    public ResponseEntity<Map<String,String>> userEntityException(NullPointerException e){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Bad Request");
        response.put("details", e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}
