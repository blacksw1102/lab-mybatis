package com.blacksw.labmybatis.hello.service;

import com.blacksw.labmybatis.hello.mapper.HelloMapper;
import com.blacksw.labmybatis.hello.dto.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloMapper helloMapper;

    public List<Hello> getAllHelloList() {
        return helloMapper.getAllHelloList();
    }

}
