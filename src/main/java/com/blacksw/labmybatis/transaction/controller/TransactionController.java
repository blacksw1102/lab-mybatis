package com.blacksw.labmybatis.transaction.controller;

import com.blacksw.labmybatis.transaction.dto.TransactionFailRequest;
import com.blacksw.labmybatis.transaction.dto.TransactionSuccessRequest;
import com.blacksw.labmybatis.transaction.service.SqlSessionService;
import com.blacksw.labmybatis.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    private final SqlSessionService sqlSessionService;

    @PostMapping("/success")
    public ResponseEntity<Integer> transactionSuccess(@RequestBody  TransactionSuccessRequest request) {
        return ResponseEntity.ok(transactionService.transactionSuccess(request));
    }

    @PostMapping("/fail")
    public ResponseEntity<Integer> transactionFail(@RequestBody TransactionFailRequest request) {
        return ResponseEntity.ok(transactionService.transactionFail(request));
    }

    @PostMapping("/sqlSession/success")
    public ResponseEntity<Integer> sqlSessionSuccess(@RequestBody TransactionSuccessRequest request) {
        return ResponseEntity.ok(sqlSessionService.transactionSuccess(request));
    }

    @PostMapping("/sqlSession/fail")
    public ResponseEntity<Integer> sqlSessionFail(@RequestBody TransactionFailRequest request) {
        return ResponseEntity.ok(sqlSessionService.transactionFail(request));
    }

}
