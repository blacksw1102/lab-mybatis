package com.blacksw.labmybatis.hello;


import com.blacksw.labmybatis.hello.dto.Hello;
import com.blacksw.labmybatis.hello.mapper.HelloMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class HelloTests {

    @Autowired
    private HelloMapper helloMapper;

    @Test
    void Hello_연결_테스트() {
        List<Hello> list = helloMapper.getAllHelloList();
        assertFalse(list.isEmpty());
    }

}
