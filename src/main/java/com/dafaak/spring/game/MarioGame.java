package com.dafaak.spring.game;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements Game{
    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Go into a pipe!");
    }

    public void left() {
        System.out.println("Go back!");
    }


    public void right() {
        System.out.println("Go forward!");
    }
}
