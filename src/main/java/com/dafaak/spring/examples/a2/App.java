package com.dafaak.spring.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.dafaak.spring.examples.a2")
public class App {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }

    }

}
