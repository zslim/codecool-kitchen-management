package com.codecool.kitchenmanagement;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date birthDate;
    private float salary;

    public Employee(String name, Date birthDate, float salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public void createTaxReport() {
        System.out.println("Tax to pay: " + salary * 0.99);
    }
}
