package com.green.DataPractice.controller;

import com.green.DataPractice.vo.LoginVo;
import com.green.DataPractice.vo.ScoreVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/score1")
    public String score1(){
        return "score_1";
    }

    @PostMapping("/score2")
    public String score2(ScoreVo scoreVo, Model model){
        System.out.println(scoreVo);
        model.addAttribute("Info",scoreVo);

        return "score_2";
    }

    @PostMapping("/score3")
    public String score3(ScoreVo scoreVo, Model model){
        System.out.println(scoreVo);
        model.addAttribute("Info", scoreVo);
        return "score_3";
    }

//    @PostMapping("/score4")
//    public String score4(){
//        return "score_4";
//    }

    @PostMapping("/score4")
    public String score4(ScoreVo scoreVo, Model model){
        System.out.println(scoreVo);

        //평균
        double avg = (scoreVo.getKorean() + scoreVo.getEnglish() + scoreVo.getMath()) / 3.0;

        model.addAttribute("Info", scoreVo);
        model.addAttribute("avg",avg);

        return "score_4";
    }


}
