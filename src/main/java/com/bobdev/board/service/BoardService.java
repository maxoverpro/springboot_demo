package com.bobdev.board.service;

import com.bobdev.board.mapper.BoardSqlMapper;
import com.bobdev.board.model.BoardDto;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardSqlMapper SqlMapper;

    public List<BoardDto> selectList() throws Exception {
        return SqlMapper.selectList();
    }

    public int insertData(String title, String content) throws Exception {
        return SqlMapper.insertData(title, content);
    }

    public int updateData(String no, String title, String content) throws Exception {
        return SqlMapper.updateData(no, title, content);
    }

    public int deleteData(String no) throws Exception {
        return SqlMapper.deleteData(no);
    }

}
