package com.blacksw.labmybatis.transaction.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionFailRequest {
    private String name;
    private String email;
    private String tel;
    private String birth;
    private String gender;
    private String role;
}
