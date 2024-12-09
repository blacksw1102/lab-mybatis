package com.blacksw.labmybatis.hello.mapper;

import com.blacksw.labmybatis.hello.dto.Hello;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloMapper {
    List<Hello> getAllHelloList();
}
