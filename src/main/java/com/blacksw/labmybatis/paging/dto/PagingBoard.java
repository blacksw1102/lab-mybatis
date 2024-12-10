package com.blacksw.labmybatis.paging.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
public class PagingBoard {

    private long id;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
