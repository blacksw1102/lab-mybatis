package com.blacksw.labmybatis.dynamic.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class DynamicResponse3 {
    private long id;
    private String tel;
    private LocalDate birth;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
