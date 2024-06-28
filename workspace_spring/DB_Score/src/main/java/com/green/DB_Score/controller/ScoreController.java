package com.green.DB_Score.controller;

import com.green.DB_Score.service.ScoreService;
import com.green.DB_Score.service.ScoreServiceImpl;
import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ScoreController {
    @Resource(name = "scoreService")
    private ScoreServiceImpl scoreService;

    // 학생 목록 페이지
    @GetMapping("/stuList")
    public String stuList(Model model){

        // 학생 목록 데이터를 db에서 조회
        List<ScoreVO> stuList = scoreService.getStuList();
        model.addAttribute("stuList", stuList);

        return "stu_list";
    }

    // 학생 등록 페이지
    @GetMapping("/regForm")
    public String regForm(){
        return "reg_stu";
    }

    // 작성한 학생을 첫 페이지에 등록, 목록 페이지 이동
    @PostMapping("/reg")
    public String reg(ScoreVO scoreVO){
        scoreService.stuReg(scoreVO);

        return "redirect:/stuList";
    }

     //상세페이지 이동
    @GetMapping("/stuDetail")
//    public String studentDetail(ScoreVO scoreVO){ // 방법1
    public String studentDetail(@RequestParam(name = "stuNum") int stuNum, Model model){ // 방법2

        // 클릭한 학생 정보를 디비에서 조회
//        scoreService.getStuDetail(scoreVO.getStuNum()); // 방법1
        ScoreVO student = scoreService.getStuDetail(stuNum); // 방법2
        model.addAttribute("student", student);// 방법2

        // 내가 클릭한 학생 한명 검색(학번 도출)
        // 학생 상세 정보 데이터를 html로 전달

        return "stu_detail";
    }

    // 학생 삭제
    @GetMapping("/deleteForm")
    public String deleteForm(@RequestParam(name = "stuNum") int stuNum){
        scoreService.getDelete(stuNum);
        return "redirect:/stuList";
    }



    // 학생 수정 페이지
    @GetMapping ("/updateForm")
    public String updateForm(@RequestParam(name = "stuNum") int stuNum, Model model){
        // 정보를 수정할 학생을 조회
        ScoreVO student = scoreService.getStuDetail(stuNum);
        model.addAttribute("student", student);

//        scoreService.getUpdate();

        return "update_stu";
    }

    // 학생 정보 수정, 상세 페이지
    @PostMapping("/updateStu")
    public String updateStu(ScoreVO scoreVO){
        scoreService.getUpdate(scoreVO);

        return "redirect:/stuDetail?stuNum=" + scoreVO.getStuNum();
    }
}
