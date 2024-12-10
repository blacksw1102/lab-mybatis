package com.blacksw.labmybatis.include.mapper;

import com.blacksw.labmybatis.include.dto.IncludeRequest;
import com.blacksw.labmybatis.include.dto.IncludeResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IncludeMapper {

    List<IncludeResponse> selectInclude(IncludeRequest request);

    long countInclude(IncludeRequest request);

}