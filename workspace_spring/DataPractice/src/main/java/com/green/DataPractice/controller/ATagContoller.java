package com.green.DataPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ATagContoller {

    @GetMapping("/a1")
    public String a1(Model model){
        model.addAttribute("stuName", "kim");
        model.addAttribute("score", 80);
        return "a1";
    }

    @GetMapping("/a2")
    public String a2(@RequestParam(name = "addr") String name){
        System.out.println("name = " + name);
        return "a2";
    }

    @GetMapping("/a3")
    public String a3(){
        return "/a3";
    }


}
