package com.example.foody.PageSave;

public class Employeesave {

    private String firstName;


    public Employeesave(String firstName) {
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

