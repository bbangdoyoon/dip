package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appctx {

    @Bean
    public ChangePwdService changePwdService(){
        return new ChangePwdService();
    }

    @Bean
}
