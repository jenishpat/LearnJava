package com.example.jenish.learnjava;

import java.util.ArrayList;

/**
 * Created by Jenish on 2017-05-06.
 */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    // Constructor
    public Player() {
        this("Unknown player");
    }

    // Method Overloading
    public Player(String handle) {
        this(handle, 1);
    }

    // Method Overloading
    public Player(String handle, int startingLevel) {
//        this.handleName = handle;
//        this.level = startingLevel;
//        this.lives = 3;
//        this.score = 0;
        setHandleName(handle);
        setLevel(startingLevel);
        setLives(3);
        setScore(0);
//        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    // **Getter and Setter**
    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println("The name " + handle + " is too short, must be 3 characters or more.");
            return;
        }
        this.handleName = handle;
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int Level) {
        setHandleName(name);
        setLevel(Level);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    /*    public void setInventory(ArrayList<Loot> inventory) {
            this.inventory = inventory;
        }*/

    // Adding items into the inventory
    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    // Dropping items from the inventory
    public boolean dropLoot(Loot loot) {
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    // Goes through the array and displays every item in the inventory
    public void showInventory() {
        for (Loot item : inventory){
            System.out.println(item.getName());
        }
        System.out.println("=========================");
    }
}


