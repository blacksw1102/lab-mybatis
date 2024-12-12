package com.blacksw.labmybatis.lazyloading.mapper;

import com.blacksw.labmybatis.lazyloading.dto.UserWithPostsResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LazyLoadingMapper {

    UserWithPostsResponse selectUserWithPosts(long id);

}
