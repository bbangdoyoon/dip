package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                  // spring객체 담는 통이 있는 class를 뜻 한다.

public class config1 {

    @Bean
    public A a() {
        return new A();
    }
}