package com.blacksw.labmybatis.resultmap.dto;

public class SelectResultMapResponse4 {
    private int id;
    private String name;
}

class SelectResultMapResponse4User extends SelectResultMapResponse4 {
    private String userField1;
}

class SelectResultMapResponse4Admin extends SelectResultMapResponse4 {
    private String adminField1;
}

