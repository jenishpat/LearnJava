package com.example.jenish.learnjava;

/**
 * Created by Jenish on 2017-03-26.
 */

public class HelloWorld {
    public static void main(String[] args) {

        int lives = 0;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);

        if (isGameOver){
            System.out.println("Game Over!");
        } else {
            System.out.println("You're still in the game");
        }
    }
}