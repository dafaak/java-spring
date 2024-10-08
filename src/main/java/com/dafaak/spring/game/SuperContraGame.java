package com.dafaak.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
