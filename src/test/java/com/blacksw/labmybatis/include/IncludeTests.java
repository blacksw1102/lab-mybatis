package com.blacksw.labmybatis.include;

import com.blacksw.labmybatis.include.dto.IncludeRequest;
import com.blacksw.labmybatis.include.dto.IncludeResponse;
import com.blacksw.labmybatis.include.mapper.IncludeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IncludeTests {

    @Autowired
    IncludeMapper includeMapper;

    @Test
    void Include_sql_include_테스트() {
        // given
        IncludeRequest request = IncludeRequest.builder()
                .name("이름")
                .limit(1)
                .offset(1)
                .build();

        // when
        List<IncludeResponse> list = includeMapper.selectInclude(request);
        long count = includeMapper.countInclude(request);

        // then
        assertNotNull(list);
        assertTrue(count > 0);
    }

}
