package com.green.DB_Score.service;

import com.green.DB_Score.vo.ScoreVO;

import java.util.List;

public interface ScoreService {

    // 학생 목록 조회
    List<ScoreVO> getStuList();

    // 학생 등록 하기
    void stuReg(ScoreVO scoreVO);

    // 상세페이지
    ScoreVO getStuDetail(int stuNum);

    // 학생 삭제
    int getDelete(int stuNum);

    // 학생 수정 / 학번을 통해서
    void getUpdate(ScoreVO scoreVO);



}
