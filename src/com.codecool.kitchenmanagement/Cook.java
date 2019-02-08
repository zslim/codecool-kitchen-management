package com.codecool.kitchenmanagement;

import java.util.Date;

public class Cook extends Employee {

    private boolean hasKnifeSet;

    public Cook(String name, Date birthDate, float salary) {
        super(name, birthDate, salary);

        hasKnifeSet = true;
    }

    public void cook() {
        System.out.println("Done with some cooking, I'll go wash my hands.");
    }
}
