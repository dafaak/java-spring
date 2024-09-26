package com.dafaak.spring;

import com.dafaak.spring.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public Game pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    public Game marioGame() {
        return new MarioGame();
    }


    @Bean
    public Game superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner SuperContraGameRunner(Game superContraGame) {
        return new GameRunner(superContraGame);
    }
    
}
