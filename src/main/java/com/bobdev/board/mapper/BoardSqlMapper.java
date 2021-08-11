package com.bobdev.board.mapper;

import com.bobdev.board.model.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardSqlMapper {

    List<BoardDto> selectList() throws Exception;
    public int insertData(String title, String content) throws Exception;
    public int updateData(String no, String title, String content) throws Exception;
    public int deleteData(String no) throws Exception;

}
