package com.mapinterface.groupemployees;

import java.util.*;

public class GroupEmployees {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = Arrays.asList(
                new Employee("Adarsh", it),
                new Employee("Uday", hr),
                new Employee("Radhamohan", hr)
        );

        Map<Department, List<Employee>> departmentMap = new HashMap<>();

        for(Employee employee:employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        for(Map.Entry<Department, List<Employee>> entry:departmentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
