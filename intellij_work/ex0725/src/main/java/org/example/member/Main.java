package org.example.member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, MemberDTO> memberlist = new HashMap<>();

    private static AnnotationConfigApplicationContext ctx = null;


    public static void main(String[] args) throws Exception {               // 가장먼저 main 함수 실행

        MemberDTO md = new MemberDTO("aa@naver.com", "홍길동", "1234");
        memberlist.put("홍길동", md);

        MemberDTO md1 = new MemberDTO("aa@naver.com", "이길동", "1234");
        memberlist.put("이길동", md1);



        ctx = new AnnotationConfigApplicationContext(Config.class);             //config.class내용으로 객체만드는 통을 만들어라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 콘솔창에서 사용자에게 입력을 받는다.

        System.out.println("1.회원가입 new aaa@naver.com 이름 1234");
        System.out.println("2.회원리스트 list");
        System.out.println("3.회원삭제 del 이름");                                 // 출력된다.
        System.out.println("4.종료 exit");

        while (true){
            String command = br.readLine();                                     // 입력받는다.
            if (command.equalsIgnoreCase("Exit")){                   // Exit 입력시
                System.out.println("프로그램 종료합니다.");                        // 프로그램 종료합니다 출력
                break;
            }
            else if (command.startsWith("new ")) {                             // new 입력시 계속 진행 : new 박길동
                String name = command.split(" ")[1];                     // key안에 이길동을 넣어라 split ~을 기준으로 잘라라 지금은 " " 빈공백
                MemberDTO md2 = new MemberDTO("bb@naver.com", name, "1234");        //member DTO 객체생성
                memberlist.put(name, md2);
                System.out.println("등록되었습니다.");
                // hashmap 안에 회원넣을 예정
            }
            else if (command.equalsIgnoreCase("list")) {
                MemberDAO dao = ctx.getBean(MemberDAO.class);
                Collection<MemberDTO> collection = dao.selectAll();           //values가 담긴다?
                collection.forEach(m -> System.out.println(m));
            }

        }

//        String command = br.readLine();                                         // readLind (한 줄을 읽어와라)
//

//
//        System.out.println(memberlist);

        //memberlist에 memberDTO(홍길동), memberDTO(md)는 객체로 생성하여 email,pswd 넣었다.
    }
}
