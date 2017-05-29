package com.example.jenish.learnjava;

import java.util.Random;

/**
 * Created by JENISH on 5/28/2017.
 */

public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        setHitPoint(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

    public boolean runAway() {
/*        if (getLives() < 2) {
            return true;
        } else {
            return false;
        }*/
        return (getLives() < 2);
    }

    public boolean dodges () {
        Random random = new Random();
        int chance = random.nextInt(6);
        if (chance > 3) {
            System.out.println("Dracula dodges");
            return true;
        } else {
            return false;
        }
    }
}
