package com.mapinterface.groupemployees;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
