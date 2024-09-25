package com.dafaak.spring;

import com.dafaak.spring.game.GameRunner;
import com.dafaak.spring.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame(); // 1: Object cration
        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of dependencies
        // Game is a dependency of GameRunner

        gameRunner.run();
    }

}
