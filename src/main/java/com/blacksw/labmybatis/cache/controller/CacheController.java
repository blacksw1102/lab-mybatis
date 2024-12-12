package com.blacksw.labmybatis.cache.controller;

import com.blacksw.labmybatis.cache.dto.*;
import com.blacksw.labmybatis.cache.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
@RequiredArgsConstructor
public class CacheController {

    private final CacheService cacheService;

    @GetMapping("local")
    public ResponseEntity<CacheLocalResponse> getCacheLocal(CacheLocalRequest request) {
        CacheLocalResponse response1 = cacheService.getCacheLocal(request);
        CacheLocalResponse response2 = cacheService.getCacheLocal(request);
        return ResponseEntity.ok(response1);
    }

    @GetMapping("/global")
    public ResponseEntity<CacheGlobalResponse> getCacheGlobal(CacheGlobalRequest requeest) {
        CacheGlobalResponse response1 = cacheService.getCacheGlobal(requeest);
        CacheGlobalResponse response2 = cacheService.getCacheGlobal(requeest);
        return ResponseEntity.ok(response1);
    }

    @PutMapping("/global")
    public ResponseEntity<UpdateGlobalCacheResponse> modifyCacheGlobal(UpdateGlobalCacheRequest request) {
        UpdateGlobalCacheResponse response = cacheService.modifyCacheGlobal(request);
        return ResponseEntity.ok(response);
    }

}
