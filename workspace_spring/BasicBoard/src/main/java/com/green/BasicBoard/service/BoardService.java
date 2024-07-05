package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {

    // 목록 조회
    List<BoardVO> getBoardList(SearchVO searchVO);

    // 글 등록하기
    void boardWrite(BoardVO boardVO);

    // 상세보기
    BoardVO getBoardDetail(int boardNum);

    // 삭제하기
    void getDelete(int boardNum);

    // 조회수 증가
    void updateReadCnt(int boardNum);
}
