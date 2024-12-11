package com.blacksw.labmybatis.common.exception;

import lombok.Data;

@Data
public class ErrorDto {
    private final int errorCode;
    private final String errorMessage;

    public ErrorDto(CustomError customError) {
        this.errorCode = customError.getErrorCode();
        this.errorMessage = customError.getErrorMessage();
    }

}
