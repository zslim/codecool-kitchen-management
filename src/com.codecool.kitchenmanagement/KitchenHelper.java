package com.codecool.kitchenmanagement;

import java.util.Date;
import java.util.Random;

public class KitchenHelper extends Employee {
    private int carrot;
    private int potato;
    private int meat;

    public KitchenHelper(String name, Date birthDate, float salary) {
        super(name, birthDate, salary);

        Random rand = new Random();
        carrot = rand.nextInt(4);
        potato = rand.nextInt(4);
        meat = rand.nextInt(4);
    }

    public boolean giveCarrot() {
        if (carrot > 0) {
            carrot --;
            return true;
        } else {
            return false;
        }
    }

    public boolean givePotato() {
        if (potato > 0) {
            potato --;
            return true;
        } else {
            return false;
        }
    }

    public boolean giveMeat() {
        if (meat > 0) {
            meat --;
            return true;
        } else {
            return false;
        }
    }

}
