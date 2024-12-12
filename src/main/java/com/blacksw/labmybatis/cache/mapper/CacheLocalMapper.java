package com.blacksw.labmybatis.cache.mapper;

import com.blacksw.labmybatis.cache.dto.CacheLocalRequest;
import com.blacksw.labmybatis.cache.dto.CacheLocalResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CacheLocalMapper {

    CacheLocalResponse selectCacheLocal(CacheLocalRequest request);

}
