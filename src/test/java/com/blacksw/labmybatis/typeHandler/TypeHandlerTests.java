package com.blacksw.labmybatis.typeHandler;

import com.blacksw.labmybatis.typeHandler.config.UserStatus;
import com.blacksw.labmybatis.typeHandler.dto.InsertUserRequest;
import com.blacksw.labmybatis.typeHandler.dto.SelectUserRequest;
import com.blacksw.labmybatis.typeHandler.dto.SelectUserResponse;
import com.blacksw.labmybatis.typeHandler.mapper.TypeHandlerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TypeHandlerTests {

    @Autowired
    TypeHandlerMapper userMapper;

    @Test
    void TypeHandler_FromEnumToVarchar변환_테스트() {
        // given
        InsertUserRequest request = InsertUserRequest.builder()
                .name("김아무개씨")
                .status(UserStatus.ACTIVE)
                .createdAt(LocalDateTime.now())
                .build();

        // when
        int result = userMapper.insertUser(request);

        // then
        assertEquals(1, result);
    }

    @Test
    void TypeHandler_FromVarcharToEnum변환_테스트() {
        // given
        SelectUserRequest request = SelectUserRequest.builder().id(3).build();

        // when
        SelectUserResponse response = userMapper.selectUser(request);

        // then
        assertEquals(UserStatus.SUSPENDED, response.getStatus());
    }

}
