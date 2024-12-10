package com.blacksw.labmybatis.paging;

import com.blacksw.labmybatis.paging.dto.PagingBoard;
import com.blacksw.labmybatis.paging.mapper.PagingMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PageTests {

    @Autowired
    PagingMapper pagingMapper;

    @Test
    void Page_페이징_테스트() {
        // given
        int limit = 2;
        int offset = 0;

        // when
        List<PagingBoard> list = pagingMapper.selectPagingBoards(limit, offset);

        // then
        assertNotNull(list);
    }

}
