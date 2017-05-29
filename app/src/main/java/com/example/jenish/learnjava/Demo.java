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

/*        VampireKing dracula = new VampireKing("dracula");
        dracula.showInfo();

        int hits = 0;

        dracula.setLives(0);

        do {
            if (dracula.dodges()) {
                dracula.setLives(dracula.getLives() + 1);
                continue;
            }

            if (dracula.runAway()) {
                System.out.println("Dracula ran away");
                break;
            } else {
                dracula.takeDamage(80);
                dracula.showInfo();
            }
            hits = hits + 1;
        } while (dracula.getLives() > 0);
        System.out.println("It took " + hits + " hits to kill the dracula");
        System.out.println("================================================");*/

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());
    }
}
