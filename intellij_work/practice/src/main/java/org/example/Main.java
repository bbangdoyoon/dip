package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(Appctx.class);

        MemberService ms = acac.getBean(MemberService.class);
        ms.regist();
        ms.getall();

        ChangePwdService cs = acac.getBean(ChangePwdService.class);
        cs.chpwd();

        acac.close();

    }
}
