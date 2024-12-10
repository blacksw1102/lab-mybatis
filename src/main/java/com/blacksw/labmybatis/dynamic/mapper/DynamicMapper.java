package com.blacksw.labmybatis.dynamic.mapper;

import com.blacksw.labmybatis.dynamic.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DynamicMapper {

    List<DynamicResponse1> selectDynamic1(DynamicRequest1 request);
    List<DynamicResponse2> selectDynamic2(DynamicRequest2 request);
    List<DynamicResponse3> selectDynamic3(DynamicRequest3 request);
    List<DynamicResponse4> selectDynamic4(DynamicRequest4 request);

}
