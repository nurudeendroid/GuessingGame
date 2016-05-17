package io.nurudeenlawal;

/**
 * Created by nurudeenlawal on 4/28/16.
 */


public class App {
    public static void main(String[]args){
        Game game = new Game();
        Player player = new Player();
        game.loopGame(player);
        }
}

