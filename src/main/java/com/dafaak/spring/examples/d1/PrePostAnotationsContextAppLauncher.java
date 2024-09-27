package com.dafaak.spring.examples.d1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("Dependencies initialized!");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleaup() {
        System.out.println("Clean up!");
    }

}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Using some dependency!");
    }
}


@Configuration
@ComponentScan("com.dafaak.spring.examples.d1")
public class PrePostAnotationsContextAppLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(PrePostAnotationsContextAppLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }

}
