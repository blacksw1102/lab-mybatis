package com.blacksw.labmybatis.paging.controller;

import com.blacksw.labmybatis.paging.dto.PagingBoard;
import com.blacksw.labmybatis.paging.dto.PagingBoardResult;
import com.blacksw.labmybatis.paging.dto.PagingRequest;
import com.blacksw.labmybatis.paging.dto.PagingResponse;
import com.blacksw.labmybatis.paging.service.PagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paging")
@RequiredArgsConstructor
public class PagingController {

    private final PagingService pagingService;

    @GetMapping
    public ResponseEntity<PagingResponse<PagingBoardResult>> getBoards(PagingRequest request) {
        return ResponseEntity.ok(pagingService.getBoards(request));
    }

}
