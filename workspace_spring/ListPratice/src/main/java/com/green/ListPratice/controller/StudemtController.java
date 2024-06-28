package com.green.ListPratice.controller;

import com.green.ListPratice.sevice.StudentService;
import com.green.ListPratice.vo.BoardVO;
import com.green.ListPratice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudemtController {
    StudentService studentService = new StudentService();

    @GetMapping ("/stuList")
    public String stuList(Model model){
        //학생 목록 데이터 받아오기
        List<StudentVO> list = studentService.getStuList();

        // 학생 목록을 html로 전달
        model.addAttribute("stuList", list);

        return "stu_list";
    }

    @GetMapping("/regForm")
    public String regForm(){
        return "reg_student";
    }

    // 작성한 학생을 첫 페이지에 등록
    @PostMapping("/regStu")
    public String regStu(StudentVO studentVO){
        System.out.println(studentVO);
        studentService.regStudent(studentVO);

        return "redirect:/stuList";
    }

    // 상세페이지 이동
    @GetMapping("/stuDetail")
    public String studentDetail(@RequestParam(name = "stuNumber") int stuNumber, Model model){

        // 내가 클릭한 학생 한명을 검색(학번을 알면 됨)
        StudentVO student = studentService.getStuDetail(stuNumber);

        // 학생 상세 정보 데이터를 html로 전달
        model.addAttribute("student", student);

        return "student_detail";
    }

    //학생 삭제 + 목록페이지로 이동
    @GetMapping("/stuDelete")
    public String delete(@RequestParam(name = "stuNumber") int stuNumber){
        // 학생 삭제
        studentService.deleteStu(stuNumber);

        return "redirect:/stuList";
    }

    // 학생 정보 수정 페이지
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name = "stuNumber") int stuNumber,Model model){
        // 정보를 수정할 학생의 원래 정보를 html에 전달
        // 1. 정보를 수정할 학생 한 명을 pick!
        StudentVO student = studentService.getStuDetail(stuNumber);

        // 2. 수정할 학생을 html로 전달
        model.addAttribute("student",student);

        return "update_student";
    }

    // 학생정보 수정 + 상세 페이지로 이동
    @PostMapping("/updateStu")
    public String updateStu(StudentVO studentVO){

        // 학생 정보 수정
        studentService.updateStu(studentVO);

        return "redirect:/stuDetail?stuNumber=" + studentVO.getStuNumber();
    }

}
