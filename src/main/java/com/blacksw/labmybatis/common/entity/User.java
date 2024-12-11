package com.blacksw.labmybatis.common.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
