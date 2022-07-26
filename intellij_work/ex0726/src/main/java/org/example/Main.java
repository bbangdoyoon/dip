package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static AnnotationConfigApplicationContext acac =null;
    public static void listCommaand(){
        MemberService memberService = acac.getBean(MemberService.class);
        memberService.list();

    }

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        acac = new AnnotationConfigApplicationContext(ClassConfig.class);  // spring 객체 담는 통안에 memberDAO하나 들어가있다.

       try {                                                                        //시도해라
           while (true) {
               System.out.println("1. list or 2. new aa@naver.com 3. exit");
               String cmd = br.readLine();
               if(cmd.equalsIgnoreCase("list")){
                   listCommaand();
               } else if (cmd.startsWith("new ")) {
                   //입력
               } else if (cmd.equalsIgnoreCase("exit")) {
                   System.out.println("종료됩니다.");
                   break;
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       finally {
           acac.close();
       }


//        MemberDAO dao = acac.getBean(MemberDAO.class);
//
//        dao.selectAll();                // memberdao 안에 selectall 메서드를 만들어야한다
//        dao.insert(new MemberDTO("홍길동", "aaa@naver.com", "1234")); //gettet, setter, 생성자, to_string. 4개를 만들어야 함.
//        dao.selectAll();
//        dao.insert(new MemberDTO("홍길동", "bbb@naver.com", "1234"));
//        dao.selectAll();

//        acac.close();

    }
}
