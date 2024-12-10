package com.blacksw.labmybatis.dynamic;

import com.blacksw.labmybatis.dynamic.dto.*;
import com.blacksw.labmybatis.dynamic.mapper.DynamicMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DynamicTests {

    @Autowired
    DynamicMapper dynamicMapper;

    @Test
    void Dynamic_where_if_테스트() {
        // given
        DynamicRequest1 request1 = DynamicRequest1.builder().name("이름3").build();
        DynamicRequest1 request2 = DynamicRequest1.builder().email("test4").build();

        // when
        List<DynamicResponse1> list1 = dynamicMapper.selectDynamic1(request1);
        List<DynamicResponse1> list2 = dynamicMapper.selectDynamic1(request2);

        // then
        assertNotNull(list1);
        assertNotNull(list2);
    }

    @Test
    void Dynamic_trim_if_테스트() {
        // given
        DynamicRequest3 request1 = DynamicRequest3.builder().tel("2222").build();
        DynamicRequest3 request2 = DynamicRequest3.builder().birth("1994").build();

        // when
        List<DynamicResponse3> list1 = dynamicMapper.selectDynamic3(request1);
        List<DynamicResponse3> list2 = dynamicMapper.selectDynamic3(request2);

        // then
        assertNotNull(list1);
        assertNotNull(list2);
    }

    @Test
    void Dynamic_switch_테스트() {
        // given
        DynamicRequest2 request1 = DynamicRequest2.builder().gender("m").build();
        DynamicRequest2 request2 = DynamicRequest2.builder().gender("w").build();
        DynamicRequest2 request3 = DynamicRequest2.builder().build();

        // when
        List<DynamicResponse2> list1 = dynamicMapper.selectDynamic2(request1);
        List<DynamicResponse2> list2 = dynamicMapper.selectDynamic2(request2);
        List<DynamicResponse2> list3 = dynamicMapper.selectDynamic2(request3);

        // then
        assertNotNull(list1);
        assertNotNull(list2);
        assertNotNull(list3);
    }

    @Test
    void Dynamic_foreach_테스트() {
        // given
        DynamicRequest4 request1 = DynamicRequest4.builder().roles(List.of("USER")).build();
        DynamicRequest4 request2 = DynamicRequest4.builder().roles(List.of("ADMIN")).build();
        DynamicRequest4 request3 = DynamicRequest4.builder().roles(List.of("USER", "ADMIN")).build();

        // when
        List<DynamicResponse4> list1 = dynamicMapper.selectDynamic4(request1);
        List<DynamicResponse4> list2 = dynamicMapper.selectDynamic4(request2);
        List<DynamicResponse4> list3 = dynamicMapper.selectDynamic4(request3);

        // then
        assertNotNull(list1);
        assertNotNull(list2);
        assertNotNull(list3);
    }

}
