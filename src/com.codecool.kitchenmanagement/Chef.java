package com.codecool.kitchenmanagement;

import java.util.Date;
import java.util.Random;

public class Chef extends Cook {

    public Chef(String name, Date birthDate, float salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cook() {
        String[] what = {"carrot", "potato", "meat", "hard work", "attention"};

        Random rand = new Random();
        int randomIndex = rand.nextInt(5);
        String thingAskedFor = what[randomIndex];

        Restaurant restaurant = Restaurant.getInstance();

        switch (thingAskedFor) {
            case "carrot":
                restaurant.askForCarrot();
                break;
            case "potato":
                break;
            case "meat":
                break;
        }

        System.out.println("Come on!! Gimme some " + thingAskedFor);
    }
}
