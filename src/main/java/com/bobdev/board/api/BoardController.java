package com.bobdev.board.api;

import com.bobdev.board.model.BoardDto;
import com.bobdev.board.model.ReturnJsonDto;
import com.bobdev.board.service.BoardService;
import com.bobdev.board.util.ReturnUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping(path = "/api")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardDto> selectList() throws Exception {
        return boardService.selectList();
    }

    @RequestMapping(value="/saveproc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnJsonDto saveproc(String title, String content) throws Exception {

        log.info("saveproc : " + title + "," + content);
        boardService.insertData(title,content);

        return ReturnUtil.createReturnObject(true, "", "", null);

    }

    @RequestMapping(value="/updateproc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnJsonDto updateproc(String no,String title, String content) throws Exception {
        boardService.updateData(no,title, content);
        return ReturnUtil.createReturnObject(true, "", "", null);
    }

    @RequestMapping(value="/deleteproc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnJsonDto deleteproc(String no) throws Exception {
        boardService.deleteData(no);
        return ReturnUtil.createReturnObject(true, "", "", null);
    }

}
