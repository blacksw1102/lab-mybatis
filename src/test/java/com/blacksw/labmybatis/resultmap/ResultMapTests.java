package com.blacksw.labmybatis.resultmap;

import com.blacksw.labmybatis.resultmap.dto.*;
import com.blacksw.labmybatis.resultmap.mapper.ResultMapMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ResultMapTests {

    @Autowired
    ResultMapMapper resultMapMapper;

    @Test
    void ResultMap_기본매핑_테스트() {
        // given
        SelectResultMapRequest1 request = SelectResultMapRequest1.builder().id(3).build();

        // when
        Optional<SelectResultMapResponse1> response = resultMapMapper.selectResultMap1(request);

        // then
        assertTrue(response.isPresent());
    }

    @Test
    void ResultMap_중첩매핑_테스트() {
        // given
        SelectResultMapRequest2 request = SelectResultMapRequest2.builder().id(3).build();

        // when
        SelectResultMapResponse2 response = resultMapMapper.selectResultMap2(request);

        // then
        assertNotNull(response);
    }

    @Test
    void ResultMap_collection매핑_테스트() {
        // given
        SelectResultMapRequest3 request1 = SelectResultMapRequest3.builder().id(3).build();
        SelectResultMapRequest3 request2 = SelectResultMapRequest3.builder().id(4).build();
        SelectResultMapRequest3 request3 = SelectResultMapRequest3.builder().id(5).build();

        // when
        SelectResultMapResponse3 response1 = resultMapMapper.selectResultMap3(request1);
        SelectResultMapResponse3 response2 = resultMapMapper.selectResultMap3(request2);
        SelectResultMapResponse3 response3 = resultMapMapper.selectResultMap3(request3);

        // then
        assertNotNull(response1);
        assertNotNull(response2);
        assertNotNull(response3);
    }

    @Test
    void ResultMap_다형성매핑_테스트() {
        // given
        SelectResultMapRequest4 request = SelectResultMapRequest4.builder().ids(Arrays.asList(1L, 2L, 3L, 4L, 5L)).build();

        // when
        List<SelectResultMapResponse4> response = resultMapMapper.selectResultMap4(request);

        // then
        assertNotNull(response);
    }

}
