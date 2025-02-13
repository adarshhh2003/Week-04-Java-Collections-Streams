package com.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    public static void saveEmployees(List<Employee> employees, String filePath) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized and saved successfully");
        } catch (IOException e) {
            System.out.println("Error saving the employees: " + e.getMessage());
        }
    }

    public static List<Employee> loadEmployees(String filePath) {
        List<Employee> employees = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            employees = (List<Employee>)ois.readObject();
            System.out.println("Employees have been deserialized successfully");
        } catch (IOException e) {
            System.out.println("Error loading employees: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Employee class not found");
        }

        return employees;
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/serialization/file.txt";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Uday", "IT", 35000.0));
        employees.add(new Employee(102, "Sanket", "IT", 35000.0));
        employees.add(new Employee(103, "Bhupendra", "HR", 25000.0));
        employees.add(new Employee(104, "Ankit", "HR", 25000.0));
        employees.add(new Employee(105, "Harsh", "MT", 20000.0));

        saveEmployees(employees, filePath);

        List<Employee> employeeList = loadEmployees(filePath);

        for(Employee employee:employeeList) {
            System.out.println(employee);
        }
    }
}
