package com.codecool.kitchenmanagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {
    private static Restaurant instance = null;

    private List<Employee> employees = new ArrayList<>();

    private Restaurant() {
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void hireCook(String name, Date birthDate, float salary) {
        Cook newCook = new Cook(name, birthDate, salary);
        employees.add(newCook);
    }

    public void hireChef(String name, Date birthDate, float salary) {
        Chef newChef = new Chef(name, birthDate, salary);
        employees.add(newChef);
    }

    public void hireKitchenHelper(String name, Date birthDate, float salary) {
        KitchenHelper newKitchenHelper = new KitchenHelper(name, birthDate, salary);
        employees.add(newKitchenHelper);
    }

    public void askForCarrot() {
        List<Employee> kitchenHelpers = employees.stream()
                .filter(t -> t instanceof KitchenHelper)
                .collect(Collectors.toList());

        boolean anyCarrots = true;
        for (Employee helper :
                kitchenHelpers) {
            if (!((KitchenHelper) helper).giveCarrot()) {
                anyCarrots = false;
                break;
            }
        }

        if (!anyCarrots) {
            for (Employee helper :
                    kitchenHelpers) {
                ((KitchenHelper) helper).yellAllOut();
            }
        }
    }
}
