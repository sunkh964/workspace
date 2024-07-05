package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
        List<BoardVO> list = sqlSession.selectList("boardMapper.getBoardList", searchVO);
        return list;
    }

    // 글 등록
    @Override
    public void boardWrite(BoardVO boardVO) {
        sqlSession.insert("boardMapper.boardWrite", boardVO);
    }

    // 상세보기
    @Override
    public BoardVO getBoardDetail(int boardNum) {
        BoardVO board = sqlSession.selectOne("boardMapper.getBoardDetail",boardNum);
        return board;
    }

    @Override
    public void getDelete(int boardNum) {
        sqlSession.delete("boardMapper.getDelete",boardNum);
    }

    //조회수 증가
    @Override
    public void updateReadCnt(int boardNum) {
        sqlSession.update("boardMapper.updateReadCnt", boardNum);
    }
}
