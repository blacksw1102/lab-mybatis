package com.blacksw.labmybatis.dynamic.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class DynamicResponse2 {
    private long id;
    private String name;
    private LocalDate birth;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
