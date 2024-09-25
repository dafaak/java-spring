package com.dafaak.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // 1. launch a spring context -
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("customBeanName"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));


        // 2. Configure the things taht we want Spring to manage
        // HelloWorldConfiguration @Configuration
        // name - @Bean

    }

}
