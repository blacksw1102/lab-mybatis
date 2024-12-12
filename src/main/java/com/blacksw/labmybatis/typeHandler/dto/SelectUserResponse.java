package com.blacksw.labmybatis.typeHandler.dto;

import com.blacksw.labmybatis.typeHandler.config.UserStatus;
import lombok.Data;

@Data
public class SelectUserResponse {
    private long id;
    private String name;
    private UserStatus status;
}
