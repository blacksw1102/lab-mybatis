package com.blacksw.labmybatis.dynamic.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DynamicRequest3 {
    private String tel;
    private String birth;
}
