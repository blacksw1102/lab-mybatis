package com.blacksw.labmybatis.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorDto> handleCustomException(CustomException e) {
        CustomError customError = e.getCustomError();
        return new ResponseEntity<>(new ErrorDto(customError), customError.getHttpStatus());
    }

}
