package com.bobdev.board.web;

import com.bobdev.board.model.BoardDto;
import com.bobdev.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/")
    public ModelAndView index() throws Exception {

        ModelAndView mv = new ModelAndView("index");
        List<BoardDto> boardList = boardService.selectList();
        mv.addObject("resultList", boardList);
        return mv;
    }

    @RequestMapping("/board/list")
    public ModelAndView list() throws Exception {
        ModelAndView mv = new ModelAndView("/board/list");
        List<BoardDto> boardList = boardService.selectList();
        mv.addObject("resultList", boardList);
        return mv;
    }

    @RequestMapping("/board/save")
    public String save() {
        return "/board/save";
    }

    @RequestMapping("/board/update")
    public String update() {
        return "/board/update";
    }

    @RequestMapping("/board/delete")
    public String delete() {
        return "/board/delete";
    }

}
