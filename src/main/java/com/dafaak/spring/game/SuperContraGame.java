package com.dafaak.spring.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements Game {
    public void up() {
        System.out.println("look up!");
    }

    public void down() {
        System.out.println("Sit down!");
    }

    public void left() {
        System.out.println("Go back!");
    }


    public void right() {
        System.out.println("Shoot!");
    }
}
