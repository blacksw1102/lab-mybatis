package com.blacksw.labmybatis.transaction.mapper;

import com.blacksw.labmybatis.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionMapper {

    int insertUser(User user);

}
