package com.example.jenish.learnjava;

/**
 * Created by JENISH on 5/22/2017.
 */

public class Enemy {
    private String name;
    private int hitPoint;
    private int lives;

    public Enemy(String name, int hitPoint, int lives) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingHitPoint = this.hitPoint - damage;
        if (remainingHitPoint > 0) {
            setHitPoint(remainingHitPoint);
            System.out.println("I took " + damage + " points damage, and have " + remainingHitPoint + " left.");
        } else {
            this.lives = this.lives - 1;
            if (this.lives > 0) {
                System.out.println("I've lost a life. " + this.lives + " lives left");
            } else {
                System.out.println("No lives left. I'm dead!");
            }
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " Hitpoints: " + this.hitPoint + " Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
