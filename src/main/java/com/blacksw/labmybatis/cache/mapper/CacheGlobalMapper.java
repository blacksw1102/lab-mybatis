package com.blacksw.labmybatis.cache.mapper;

import com.blacksw.labmybatis.cache.dto.CacheGlobalRequest;
import com.blacksw.labmybatis.cache.dto.CacheGlobalResponse;
import com.blacksw.labmybatis.cache.dto.UpdateGlobalCacheRequest;
import com.blacksw.labmybatis.cache.dto.UpdateGlobalCacheResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CacheGlobalMapper {

    CacheGlobalResponse selectCacheGlobal(CacheGlobalRequest request);

    int updateCacheGlobal(UpdateGlobalCacheRequest request);

}
