package com.dafaak.spring;

import com.dafaak.spring.game.Game;
import com.dafaak.spring.game.GameRunner;
import com.dafaak.spring.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
//            context.getBean(Game.class).up();

            context.getBean(GameRunner.class).run();
        }

    }

}
