package com.mapinterface.groupemployees;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
