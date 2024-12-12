package com.blacksw.labmybatis.typeHandler.dto;

import com.blacksw.labmybatis.typeHandler.config.UserStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class InsertUserRequest {
    private String name;
    private UserStatus status;
    private LocalDateTime createdAt;
}
