package com.blacksw.labmybatis.resultmap.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SelectResultMapRequest4 {
    private List<Long> ids;
}
