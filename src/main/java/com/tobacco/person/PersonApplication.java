package com.tobacco.person;

import com.tobacco.helloworld.HelloWorldService;
import com.tobacco.helloworld.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Chen Jian
 */


@SpringBootApplication
@MapperScan(basePackages = {"com.tobacco.generator.mapper","com.tobacco.mapper"})
public class PersonApplication {

    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }

    @Bean
    public TestService testService() {
        return new TestService();
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }

}
