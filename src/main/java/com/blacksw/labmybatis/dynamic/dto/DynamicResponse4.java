package com.blacksw.labmybatis.dynamic.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DynamicResponse4 {
    private long id;
    private String name;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
