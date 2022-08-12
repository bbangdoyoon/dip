package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                                                        // spring 객체 담는 통
public class Appctx {

    @Bean
    public ChangePwdService changePwdService() {
        return new ChangePwdService();
    }

    @Bean
    public MemberService memberService(){
        return new MemberService();
    }

    @Bean
    @Qualifier("memberdao1")
    public MemberDAO memberDAO1(){
        return new MemberDAO();
    }

    @Bean
    public MemberDAO memberDAO2() {
        return new MemberDAO();
    }

}
