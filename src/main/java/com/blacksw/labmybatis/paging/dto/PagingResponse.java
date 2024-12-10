package com.blacksw.labmybatis.paging.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PagingResponse<T> {
    private List<T> data;
    private int currentPage;
    private int totalPages;
    private long totalItems;
}
