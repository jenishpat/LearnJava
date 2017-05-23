package com.example.jenish.learnjava;

/**
 * Created by Jenish on 2017-05-09.
 */

public class Demo {

    public static void main(String[] args) {
        /*Player jenish = new Player("Jenish Patel"); // Created instance of a player class
       *//* System.out.println("Player: " + jenish.getHandleName());
        System.out.println("Level: " + jenish.getLevel());
        System.out.println("Lives: " + jenish.getLives());
        System.out.println("Weapon: " + jenish.getWeapon().getName());*//*

        Weapon myAxe = new Weapon("Goldshine Axe", 20, 50);
        *//*jenish.setWeapon(myAxe);
        System.out.println(jenish.getWeapon().getName());*//*

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        jenish.pickUpLoot(redPotion);
        jenish.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        jenish.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        jenish.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        jenish.showInventory();

        boolean wasDeleted = jenish.dropLoot(redPotion);
        System.out.println(wasDeleted);
        jenish.showInventory();*/

        /*Enemy enemy = new Enemy("Jenish Patel", 10, 3);
        enemy.showInfo();
        enemy.takeDamage(7);
        enemy.showInfo();*/
        Troll uglyTroll = new Troll("Jay Bhavsar");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(27);
    }
}
