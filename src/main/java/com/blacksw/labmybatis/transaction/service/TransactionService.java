package com.blacksw.labmybatis.transaction.service;

import com.blacksw.labmybatis.common.entity.User;
import com.blacksw.labmybatis.common.exception.CustomError;
import com.blacksw.labmybatis.common.exception.CustomException;
import com.blacksw.labmybatis.common.util.Util;
import com.blacksw.labmybatis.transaction.dto.TransactionFailRequest;
import com.blacksw.labmybatis.transaction.dto.TransactionSuccessRequest;
import com.blacksw.labmybatis.transaction.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionMapper transactionMapper;

    @Transactional
    public int transactionSuccess(TransactionSuccessRequest request) {
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .birth(Util.convertFromStringToLocalDate(request.getBirth()))
                .tel(request.getTel())
                .gender(request.getGender())
                .role(request.getRole())
                .createdAt(LocalDateTime.now())
                .build();

        return transactionMapper.insertUser(user);
    }

    @Transactional
    public int transactionFail(TransactionFailRequest request) {
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .birth(Util.convertFromStringToLocalDate(request.getBirth()))
                .tel(request.getTel())
                .gender(request.getGender())
                .role(request.getRole())
                .createdAt(LocalDateTime.now())
                .build();

        int result = transactionMapper.insertUser(user);
        if (result == 1) {
            throw new CustomException(CustomError.INTERNAL_SERVER_ERROR);
        }

        return result;
    }
}
