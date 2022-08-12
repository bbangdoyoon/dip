package my.com.dip.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	//환경 잡는 객체
@ComponentScan(basePackages = {"my.dip.org.member"})	//어디에서?
public class AppConfig {


}
