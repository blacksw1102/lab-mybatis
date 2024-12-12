package com.blacksw.labmybatis.cache.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CacheGlobalResponse implements Serializable {
    private long id;
    private String name;
    private String email;
}
