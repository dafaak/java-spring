package com.dafaak.spring.examples.b1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {

    ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Initialization class B");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing something!");
    }
}


@Configuration
@ComponentScan("com.dafaak.spring.examples.b1")
public class LazyInitializationAppLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class)) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Context initialized!");
            context.getBean(ClassB.class).doSomething();
        }

    }

}
