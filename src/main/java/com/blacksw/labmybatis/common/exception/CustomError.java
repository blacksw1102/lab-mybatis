package com.blacksw.labmybatis.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum CustomError {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 9999, "시스템 에러입니다.");

    private final HttpStatus httpStatus;
    private final int errorCode;
    private final String errorMessage;
}
