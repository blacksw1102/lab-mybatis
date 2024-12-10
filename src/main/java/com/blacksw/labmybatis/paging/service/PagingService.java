package com.blacksw.labmybatis.paging.service;

import com.blacksw.labmybatis.common.util.Util;
import com.blacksw.labmybatis.paging.dto.PagingBoard;
import com.blacksw.labmybatis.paging.dto.PagingBoardResult;
import com.blacksw.labmybatis.paging.dto.PagingRequest;
import com.blacksw.labmybatis.paging.dto.PagingResponse;
import com.blacksw.labmybatis.paging.mapper.PagingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PagingService {

    private final PagingMapper pagingMapper;

    public PagingResponse<PagingBoardResult> getBoards(PagingRequest request) {
        // given
        int limit = request.getSize();
        int offset = (request.getPage() - 1) * request.getSize();

        // when
        List<PagingBoard> boards = pagingMapper.selectPagingBoards(limit, offset);
        List<PagingBoardResult> data = boards.stream()
                .map((board) -> PagingBoardResult.builder()
                        .id(board.getId())
                        .title(board.getTitle())
                        .createdAt(Util.convertFromLocalDateTimeToString(board.getCreatedAt()))
                        .updatedAt(Util.convertFromLocalDateTimeToString(board.getUpdatedAt()))
                        .build())
                .toList();
        long totalItems = pagingMapper.countBoards();
        int totalPages = (int) Math.ceil((double) totalItems / request.getSize());

        // then
        return PagingResponse.<PagingBoardResult>builder()
                .data(data)
                .currentPage(request.getPage())
                .totalPages(totalPages)
                .totalItems(totalItems)
                .build();
    }

}
