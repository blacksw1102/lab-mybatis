package com.blacksw.labmybatis.typeHandler.config;

import com.blacksw.labmybatis.common.exception.CustomError;
import com.blacksw.labmybatis.common.exception.CustomException;

public enum UserStatus {
    ACTIVE,
    INACTIVE,
    SUSPENDED;

    public static UserStatus fromString(String value) {
        for (UserStatus status : UserStatus.values()) {
            if (status.name().equals(value)) {
                return status;
            }
        }
        throw new CustomException(CustomError.INTERNAL_SERVER_ERROR);
    }
}
