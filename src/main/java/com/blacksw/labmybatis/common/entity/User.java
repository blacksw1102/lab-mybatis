package com.blacksw.labmybatis.common.entity;

import com.blacksw.labmybatis.typeHandler.config.UserStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class User {
    private long id;
    private String name;
    private String email;
    private String tel;
    private LocalDate birth;
    private String gender;
    private String role;
    private UserStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
