package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberService {

    @Qualifier("memberdao1")
    @Autowired(required = false)                                                       //  Autowired에 의한 DI 방식
    private MemberDAO memberDAO;

    //저장
    public void regist(){
        memberDAO.insert();                                          // alt + enter로 memberdao에 메소드 생성

    }

    //보기
    public void getall(){
        memberDAO.selectall();                                       // alt + enter로 memberdao에 메소드 생성

    }
}

//삭제

//변경

