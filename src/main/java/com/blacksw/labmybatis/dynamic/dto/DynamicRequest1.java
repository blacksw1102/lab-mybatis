package com.blacksw.labmybatis.dynamic.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DynamicRequest1 {
    private String name;
    private String email;
}
