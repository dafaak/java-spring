package com.dafaak.spring.examples.f1;

import com.dafaak.spring.game.GameRunner;
import com.dafaak.spring.game.PacmanGame;
import com.dafaak.spring.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


@Configuration
@ComponentScan("com.dafaak.spring.examples.a1")
public class XMLConfigAppLauncher {

    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean(SuperContraGame.class));
            context.getBean(GameRunner.class).run();
        }

    }

}
