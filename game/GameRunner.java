package com.in28minutes.learnspringframework.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GamingConsole game;


    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game)
    {
                this.game = game;
    }
    //Autowiring here--we are directly specifying a bean

    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
