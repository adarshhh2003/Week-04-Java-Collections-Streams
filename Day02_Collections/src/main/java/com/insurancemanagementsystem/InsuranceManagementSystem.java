package com.insurancemanagementsystem;

import java.util.*;
public class InsuranceManagementSystem {
    Set<InsurancePolicy> policies = new HashSet<>();

    public void addPolicy(InsurancePolicy policy) {
        policies.add(policy);
    }

    public void displayPolicies() {
        policies.forEach(System.out::println);
    }

    public static void main(String[] args) {
        InsuranceManagementSystem system = new InsuranceManagementSystem();
        system.addPolicy(new InsurancePolicy("P1001", "Uday", "Health", 1200));
        system.addPolicy(new InsurancePolicy("P1002", "Aman", "Auto", 800));

        System.out.println("Policies:");
        system.displayPolicies();
    }
}