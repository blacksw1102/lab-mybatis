package com.blacksw.labmybatis.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String convertFromLocalDateTimeToString(LocalDateTime localDateTime) {
        return (localDateTime != null) ? dateTimeFormatter.format(localDateTime) : null;
    }

}
