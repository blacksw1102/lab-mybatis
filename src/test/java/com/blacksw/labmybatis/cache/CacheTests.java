package com.blacksw.labmybatis.cache;

import com.blacksw.labmybatis.cache.dto.CacheLocalRequest;
import com.blacksw.labmybatis.cache.dto.CacheLocalResponse;
import com.blacksw.labmybatis.cache.mapper.CacheLocalMapper;
import org.apache.ibatis.session.LocalCacheScope;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class CacheTests {

    @Autowired
    CacheLocalMapper cacheMapper;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    void Cache_로컬캐시_enabled_테스트() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // given
            CacheLocalRequest request = CacheLocalRequest.builder().id(3).build();

            // when
            sqlSession.getConfiguration().setLocalCacheScope(LocalCacheScope.SESSION);
            CacheLocalResponse response1 = cacheMapper.selectCacheLocal(request);
            CacheLocalResponse response2 = cacheMapper.selectCacheLocal(request);

            // then
            assertNotNull(response1);
            assertNotNull(response2);
            assertSame(response1, response2);
        }
    }

    @Test
    void Cache_로컬캐시_disabled_테스트() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // given
            CacheLocalRequest request = CacheLocalRequest.builder().id(3).build();

            // when
            sqlSession.getConfiguration().setLocalCacheScope(LocalCacheScope.STATEMENT);
            CacheLocalResponse response1 = cacheMapper.selectCacheLocal(request);
            CacheLocalResponse response2 = cacheMapper.selectCacheLocal(request);

            // then
            assertNotNull(response1);
            assertNotNull(response2);
            assertNotSame(response1, response2);
        }
    }

}
