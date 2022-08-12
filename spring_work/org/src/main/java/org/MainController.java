package org;

import org.config.AppConfig;
import org.member.MemberDto;
import org.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac = new					// 객체 담는 통 생성 -> Member Dao, member service를 담았다
				AnnotationConfigApplicationContext(AppConfig.class);	// 메모리 소모를 줄이기 위해.		
		
		MemberService ms = 
				acac.getBean(MemberService.class);
		
		ms.newMember(new MemberDto("홍길동", "aa@naver.com", "1234")); 
		//member dto에 생성자, getter, setter, to string, 기본생성자 생성 
		
		ms.newMember(new MemberDto("홍길동", "aa@naver.com", "1234"));
		ms.newMember(new MemberDto("홍길동", "bb@naver.com", "1234"));
		ms.newMember(new MemberDto("홍길동", "cc@naver.com", "1234"));
		ms.printMember();
		
		
		
		
		acac.close();

		
		
	}

}
