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
    public static void newCommaand(MemberDTO dto) {
        MemberService memberService = acac.getBean(MemberService.class);
        try {
            memberService.regist(dto);
        }catch (Exception e){
            System.out.println("email 중복됨..... 넣을수 없음...");
        }
    }
    private static void updateCommaand(String email, String oldpwd, String newpwd) {
    }

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        acac = new AnnotationConfigApplicationContext(ClassConfig.class);  // spring 객체 담는 통안에 memberDAO하나 들어가있다.

       try {                                                                        //시도해라
           while (true) {
               System.out.println("1.list or 2.new aa@naver.com 3.update 4.exit");
               String cmd = br.readLine();
               if(cmd.equalsIgnoreCase("list")){
                   listCommaand();
               } else if (cmd.startsWith("new")) {
                   //입력
                   // new aa@navr.com 김길동 1234
                   try {
                       String email = cmd.split(" ")[1];
                       String name = cmd.split(" ")[2];
                       String pwd = cmd.split(" ")[3];
                       MemberDTO md = new MemberDTO(email, name, pwd);
                       newCommaand(md);
                   } catch (IndexOutOfBoundsException ie){
                       System.out.println("new aa@naver.com 김길동 1234 \n 이렇게 입력하세요.");
                   }
               }
               else if (cmd.startsWith("update")) {
                   try {
                       String email = cmd.split(" ")[1];
                       String oldpwd = cmd.split(" ")[2];
                       String newpwd = cmd.split(" ")[3];

                       updateCommaand(email, oldpwd, newpwd);


                   }catch (Exception e){
                       System.out.println("update aa@naver.com 1234 1234\n 이렇게 입렵하세요.");
                       System.out.println(e.toString());
                   }

               }
               else if (cmd.equalsIgnoreCase("exit")) {
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
