package com.blacksw.labmybatis.lazyloading.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserWithPostsResponse {
    private long id;
    private String name;
    private List<PostResponse> posts;

    @Data
    public static class PostResponse {
        private long id;
        private String title;
        private String contents;
    }
}
