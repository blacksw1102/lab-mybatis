package com.blacksw.labmybatis.dynamic.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DynamicRequest4 {
    List<String> roles;
}
