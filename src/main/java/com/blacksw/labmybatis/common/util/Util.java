package com.blacksw.labmybatis.common.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    private static final DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static String convertFromLocalDateTimeToString(LocalDateTime localDateTime) {
        return (localDateTime != null) ? dateTimeFormatter1.format(localDateTime) : null;
    }

    public static LocalDate convertFromStringToLocalDate(String str) {
        return LocalDate.parse(str, dateTimeFormatter2);
    }

}
