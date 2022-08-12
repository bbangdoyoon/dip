package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ImportConfig.class)
public class ClassConfig {
    @Autowired
    private MemberDAO memberDAO;

    @Autowired
    private MemberPrinter memberPrinter;

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }
    //생성자에 의한 DI방식

    @Bean MemberPrinter memberPrinter(){
        return new MemberPrinter("1.0");
    }
//    @Bean MemberService memberService(){
//        return new MemberService(memberDAO());
    // setter에 의한 DI방식

    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
//        ms.setMemberDAO(memberDAO);
//        ms.setMemberPrinter(memberPrinter);
        return ms;

    }

}
