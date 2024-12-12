package com.blacksw.labmybatis.cache.service;

import com.blacksw.labmybatis.cache.dto.*;
import com.blacksw.labmybatis.cache.mapper.CacheGlobalMapper;
import com.blacksw.labmybatis.cache.mapper.CacheLocalMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CacheService {

    private final CacheLocalMapper cacheLocalMapper;
    private final CacheGlobalMapper cacheGlobalMapper;

    @Transactional
    public CacheLocalResponse getCacheLocal(CacheLocalRequest request) {
        CacheLocalResponse response1 = cacheLocalMapper.selectCacheLocal(request);
        CacheLocalResponse response2 = cacheLocalMapper.selectCacheLocal(request);

        boolean flag = response1 == response2;
        log.info("flag : " + flag);

        return response1;
    }

    @Transactional
    public CacheGlobalResponse getCacheGlobal(CacheGlobalRequest request) {
        CacheGlobalResponse response1 = cacheGlobalMapper.selectCacheGlobal(request);
        CacheGlobalResponse response2 = cacheGlobalMapper.selectCacheGlobal(request);

        boolean flag = response1 == response2;
        log.info("flag : " + flag);

        return response1;
    }

    @Transactional
    public UpdateGlobalCacheResponse modifyCacheGlobal(UpdateGlobalCacheRequest request) {
        int result = cacheGlobalMapper.updateCacheGlobal(request);
        return UpdateGlobalCacheResponse.builder().result(result).build();
    }

}
