package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.text.Annotation;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")

public class App03GamingSpringBeans {


    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        System.out.println("Parameter: " + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

//var game= new MarioGame(); //1.Object creation
//var game= new SuperContraGame();
//var game = new PacmanGame();
//var gameRunner = new GameRunner(game);
//2: Object creation + Wiring of Dependencies
//passing game parameter to the constructor of Game Runner
//Game is a dependency of GameRunner class
// gameRunner.run();





