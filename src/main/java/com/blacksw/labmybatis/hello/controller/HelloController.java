package com.blacksw.labmybatis.hello.controller;

import com.blacksw.labmybatis.hello.dto.Hello;
import com.blacksw.labmybatis.hello.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public List<Hello> getAllHelloList() {
        return helloService.getAllHelloList();
    }

}
