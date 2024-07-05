package com.green.BasicBoard.controler;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    // 첫 페이지
    @RequestMapping("/list")
    public String list(Model model, SearchVO searchVO){
        // search 데이터 검사
        System.out.println(searchVO);


        // 데이터 조회
        List<BoardVO> boardList =  boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardList);

        return "board_list";
    }

    // 글 등록 페이지
    @GetMapping("/writeForm")
    public String writeForm(){
        return "write_form";
    }

    // 첫 페이지에 글등록
    @PostMapping("/write")
    public String write(BoardVO boardVO){
        boardService.boardWrite(boardVO);

        return "redirect:/list";
    }

    //상세페이지 이동
    @GetMapping("/detail")
    public String detail(@RequestParam(name = "boardNum") int boardNum, Model model){

        // 조회수 증가
        boardService.updateReadCnt(boardNum);

//        BoardVO board = boardService.getBoardDetail(boardNum);
//        model.addAttribute("board", board);

        model.addAttribute("board", boardService.getBoardDetail(boardNum));

        return "board_detail";
    }

    // 게시글 삭제
    @GetMapping("/delete")
    public String delete(@RequestParam(name = "boardNum")int boardNum){
        boardService.getDelete(boardNum);
        return "redirect:/list";
    }

    // 게시글 수정 페이지
    @GetMapping("/updateForm")
    public String update(){

        return "update_stu";
    }

}
