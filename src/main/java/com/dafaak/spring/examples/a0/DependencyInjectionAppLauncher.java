package com.dafaak.spring.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.dafaak.spring.examples.a1")
public class DependencyInjectionAppLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionAppLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }

}
