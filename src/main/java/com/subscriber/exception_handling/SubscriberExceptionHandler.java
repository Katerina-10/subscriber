package com.subscriber.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SubscriberExceptionHandler {

    @ExceptionHandler // исключение при некорректных sql
    public ResponseEntity<SaveIncorrectData> handlerException(Exception ex)
    {
        SaveIncorrectData data = new SaveIncorrectData();
        data.setInfo(ex.getMessage());
        System.out.println("Exception: " + ex.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
