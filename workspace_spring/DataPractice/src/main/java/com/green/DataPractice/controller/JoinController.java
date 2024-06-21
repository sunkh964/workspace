package com.green.DataPractice.controller;

import com.green.DataPractice.vo.JoinVo;
import com.green.DataPractice.vo.SurveyVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Member;

@Controller
public class JoinController {

    @GetMapping("/reg")
    public String reg(){
        return "reg_member";
    }

    //커맨드 객체는 model 을 사용하지 않아도 자동으로 html로 전달된다.
    // 이때 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼 이름으로 넘어간다
    @PostMapping("/member")
    public String member(JoinVo joinVo){
        System.out.println(joinVo);
        return "member_info";
    }

    @GetMapping("/survey")
    public String survey(){
        return "survey";
    }

    @PostMapping("/sResult")
    public String sResult(SurveyVo surveyVo){
        System.out.println(surveyVo.toString());
        return "survey_result";
    }

    @GetMapping("/a")
    public String name(){
        return "input_name";
    }

    @PostMapping("/b")
    public String age(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "input_age";
    }

    @PostMapping("/c")
    public String show(@RequestParam(name = "name")String name, @RequestParam(name = "age")int age, Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "show";
    }


}
