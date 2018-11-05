package net.mafsus.videogame;

public class Game {

    static Game game;
    public static final float TICK_INTERVAL = 1/30f;
    public static final float TICK_INTERVAL_SQRD = TICK_INTERVAL*TICK_INTERVAL;
    public void gameLoop(){


    }

    public static Game createGame(){
        if(game!=null) return game;
        game = new Game();
        return game;
    }
}
