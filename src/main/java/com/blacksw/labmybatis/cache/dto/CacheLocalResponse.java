package com.blacksw.labmybatis.cache.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CacheLocalResponse {
    private long id;
    private String name;
    private String email;
    private String tel;
}
