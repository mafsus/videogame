package net.mafsus.videogame;

import net.mafsus.videogame.tests.Tests;

public class Game {

    static Game game;
    public static final float TICK_INTERVAL = 1/30f;
    public static final float TICK_INTERVAL_SQRD = TICK_INTERVAL*TICK_INTERVAL;

    boolean isInitialized;

    public void preinit(){

    }

    public void init(){
        isInitialized=true;
        Tests.runInitialTests();
    }
    public void gameLoop(){
        if(!isInitialized) init();
        Tests.runContinuousTests();
    }

    public static Game createGame(){
        if(game!=null) return game;
        game = new Game();
        game.preinit();
        return game;
    }
}
