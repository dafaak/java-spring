package com.dafaak.spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.dafaak.spring.game")
public class GamingAppLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            context.getBean(GameRunner.class).run();
        }

    }

}
