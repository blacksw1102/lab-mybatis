package com.blacksw.labmybatis.paging.dto;

import lombok.Data;

@Data
public class PagingRequest {
    private int page;
    private int size;
}
