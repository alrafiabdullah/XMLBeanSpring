package com.abdullahalrafi.springbootproject.main;

import com.abdullahalrafi.springbootproject.main.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class SpringBootProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

        Coder coder = (Coder) context.getBean("coder1");
        System.out.println(coder.getName() + " works on " + coder.getLanguage() + " using " + coder.getComputer().getBrand());
    }
}
