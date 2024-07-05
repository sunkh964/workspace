package com.green.BasicBoard.controler;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReactController {
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    // 첫 페이지
    @RequestMapping("/list2")
    public List<BoardVO> list(Model model, SearchVO searchVO){

        // 데이터 조회
        List<BoardVO> boardList =  boardService.getBoardList(searchVO);

        return boardList;
    }

}
