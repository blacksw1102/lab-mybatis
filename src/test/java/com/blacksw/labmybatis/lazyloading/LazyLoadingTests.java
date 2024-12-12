package com.blacksw.labmybatis.lazyloading;

import com.blacksw.labmybatis.lazyloading.dto.UserWithPostsResponse;
import com.blacksw.labmybatis.lazyloading.mapper.LazyLoadingMapper;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class LazyLoadingTests {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    LazyLoadingMapper lazyLoadingMapper;

    @Test
    void LazyLoading_lazyLoading_비활성화() {
        // given
        Configuration configuration = sqlSessionFactory.getConfiguration();
        configuration.setLazyLoadingEnabled(false);
        configuration.setAggressiveLazyLoading(false);

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // when
            UserWithPostsResponse userWithPosts = sqlSession.getMapper(LazyLoadingMapper.class).selectUserWithPosts(3);
            String name = userWithPosts.getName();

            // then
            assertNotNull(name);
        }
    }

    @Test
    void LazyLoading_lazyLoading_활성화_aggressiveLazyLoading_활성화() {
        // given
        Configuration configuration = sqlSessionFactory.getConfiguration();
        configuration.setLazyLoadingEnabled(true);
        configuration.setAggressiveLazyLoading(true);

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // when
            UserWithPostsResponse userWithPosts = sqlSession.getMapper(LazyLoadingMapper.class).selectUserWithPosts(3);
            String name = userWithPosts.getName();
            String title = userWithPosts.getPosts().get(0).getTitle();

            // then
            assertNotNull(name);
            assertNotNull(title);
        }
    }


}
