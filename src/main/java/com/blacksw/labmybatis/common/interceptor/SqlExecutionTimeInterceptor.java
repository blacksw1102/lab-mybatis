package com.blacksw.labmybatis.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Properties;

@Slf4j
@Intercepts(@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class}))
public class SqlExecutionTimeInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        LocalTime startTime = LocalTime.now();
        Object result = invocation.proceed();
        LocalTime endTime = LocalTime.now();
        long elapsedTime = Duration.between(startTime, endTime).toMillis();

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        String sql = statementHandler.getBoundSql().getSql().replaceAll("[\\s]+", " ");
        log.info("sql : " + sql);
        log.info("sql execution time : " + elapsedTime + "ms");

        return result;
    }


    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {}

}
