package org.config;

import org.member.MemberDao;
import org.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.member"})
public class AppConfig {

	public static void main(String[] args) {
		ms.newMember(new MemberDto("홍길동", "aa@naver.com", "1234"));
	}
//	
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}
//	
//	@Bean
//	public MemberService memberService() {
//		return new MemberService();
//	}
//	
//	
	

}
