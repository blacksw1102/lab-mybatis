package com.blacksw.labmybatis.hello.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hello {
    private long id;
    private String title;
}
