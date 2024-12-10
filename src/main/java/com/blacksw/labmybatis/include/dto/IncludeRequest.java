package com.blacksw.labmybatis.include.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IncludeRequest {
    private String name;
    private String email;
    private String tel;
    private String birth;
    private int limit;
    private int offset;
}
