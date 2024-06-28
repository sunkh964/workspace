package com.green.DB_Member.controller;

import com.green.DB_Member.service.MemberService;
import com.green.DB_Member.service.MemberServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  // 컨트롤러 + 객체 생성
public class MemberController {
    @Resource(name = "memberService")
    private MemberServiceImpl memberService;

    // 회원 목록 페이지
    @GetMapping("/")
    public  String memberlist(){

        return "member_list";
    }

    @GetMapping("/insertForm")
    public String insertForm(){
        return "reg_member";
    }

    // 회원등록 = 회원 목록 페이지
    @PostMapping("/insertMember")
    public String insertMember(MemberVO memberVO){

        // html에서 가져온 데이터를 TEST_MEMBER 테이블에 INSERT
        memberService.insertMember(memberVO);

        return "redirect:/";
    }
}
