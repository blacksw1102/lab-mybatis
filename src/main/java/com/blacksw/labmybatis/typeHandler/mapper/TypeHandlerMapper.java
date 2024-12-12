package com.blacksw.labmybatis.typeHandler.mapper;

import com.blacksw.labmybatis.typeHandler.dto.InsertUserRequest;
import com.blacksw.labmybatis.typeHandler.dto.SelectUserRequest;
import com.blacksw.labmybatis.typeHandler.dto.SelectUserResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeHandlerMapper {

    int insertUser(InsertUserRequest request);

    SelectUserResponse selectUser(SelectUserRequest request);

}
