package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassConfig {

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }
    //생성자에 의한 DI방식

//    @Bean MemberService memberService(){
//        return new MemberService(memberDAO());
    // setter에 의한 DI방식

    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
        ms.setMemberDAO((memberDAO()));
        return ms;

    }

}
