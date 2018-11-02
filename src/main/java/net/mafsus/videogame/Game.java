package net.mafsus.videogame;

public class Game {

    static Game game;


    public void gameLoop(){


    }

    public static Game createGame(){
        if(game!=null) return game;
        game = new Game();
        return game;
    }
}
