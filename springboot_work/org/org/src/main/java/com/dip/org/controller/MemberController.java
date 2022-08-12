package com.dip.org.controller;


import com.dip.org.components.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    //문자열 반환        @controller는 html파일 변환 @ResponseBody는 문자열 반환
public class MemberController {

    @Autowired
    AA aa;
    //127.0.0.1:8080/rest/member
    @GetMapping("member")

    public String member(){
        aa.doA();
        return "member";
    }

   // @GetMapping("membergetall")



}
