package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mymain {
    public static void main(String[] args) {

        Greeter g1 = new Greeter();                 //Greeter라는 객체 생성 g1으로 명명
        Greeter g2 = new Greeter();                  //Greeter라는 객체 생성 g2으로 명명

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g1==g2);                 // 메모리상 주소는 다르다 그래서 false

        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(Appcontext.class);

        Greeter g3 = acac.getBean(Greeter.class);
        Greeter g4 = acac.getBean(Greeter.class);

        System.out.println(g3);.
        System.out.println(g4);
        System.out.println(g3==g4);                 // 메모리상 주소가 같다 그래서 true


//        Greeter g = acac.getBean(Greeter.class);
//        getBean은 객체를 가리키는 통, 객체를 만들어야 메모리 낭비가 덜하다.
//        g.hi();
        acac.close();
    }
}
