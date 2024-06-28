package com.green.DB_Score.service;

import com.green.DB_Score.vo.ScoreVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private SqlSessionTemplate sqlSession;



    @Override
    public List<ScoreVO> getStuList() {
        List<ScoreVO> list = sqlSession.selectList("scoreMapper.getStuList");
        return list;
    }

    @Override
    public void stuReg(ScoreVO scoreVO) {
        sqlSession.insert("scoreMapper.stuReg", scoreVO);

    }

    @Override
    public ScoreVO getStuDetail(int stuNum) {
        ScoreVO student = sqlSession.selectOne("scoreMapper.getStuDetail",stuNum);
        return student;
    }

    @Override
    public int getDelete(int stuNum) {
        int result = sqlSession.delete("scoreMapper.getDelete", stuNum);
        return result;
    }

    @Override
    public void getUpdate(ScoreVO scoreVO) {
        sqlSession.update("scoreMapper.getUpdate", scoreVO);
    }


}
