package com.blacksw.labmybatis.paging.mapper;

import com.blacksw.labmybatis.paging.dto.PagingBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PagingMapper {

    List<PagingBoard> selectPagingBoards(@Param("limit") int limit, @Param("offset") int offset);

    long countBoards();

}
