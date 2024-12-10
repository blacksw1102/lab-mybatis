package com.blacksw.labmybatis.paging.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PagingBoardResult {

    private long id;
    private String title;
    private String createdAt;
    private String updatedAt;

}
