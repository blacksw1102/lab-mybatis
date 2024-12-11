package com.blacksw.labmybatis.resultmap.mapper;

import com.blacksw.labmybatis.resultmap.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ResultMapMapper {

    Optional<SelectResultMapResponse1> selectResultMap1(SelectResultMapRequest1 request);

    SelectResultMapResponse2 selectResultMap2(SelectResultMapRequest2 request);

    SelectResultMapResponse3 selectResultMap3(SelectResultMapRequest3 request);

    List<SelectResultMapResponse4> selectResultMap4(SelectResultMapRequest4 request);

}
