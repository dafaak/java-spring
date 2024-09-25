package com.dafaak.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Address(String street, String number) {
}

record Person(String name, int age, Address address) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Israel";
    }

    @Bean
    public String name2() {
        return "Benito";
    }

    @Bean
    public int age() {
        return 31;
    }

    @Bean(name = "customBeanName")
    public Address address() {
        return new Address("La colmena", "e1-238");
    }

    @Bean
    public Person person() {
        return new Person("Jose", 20, new Address("Montufar", "e1-234"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }


    @Bean
    public Person person3(String name2, int age, Address address) {
        return new Person(name2, age, address);
    }
}
