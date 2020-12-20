package com.example.foody.PageOrder;

public class Employee {

    private String firstName;


    public Employee(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }
}

