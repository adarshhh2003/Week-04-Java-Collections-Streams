package com.insurancesystem;

import java.time.LocalDate;
import java.util.*;

public class InsuranceSystem {
    Map<String, InsurancePolicy> policyMap = new HashMap<>();  // For fast lookups
    Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>(); // Maintains insertion order
    TreeMap<LocalDate, InsurancePolicy> sortedByExpiry = new TreeMap<>();  // Sorted by expiry date

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedByExpiry.put(policy.expiryDate, policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        return new ArrayList<>(sortedByExpiry.subMap(today, next30Days).values());
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedByExpiry.headMap(today, true).clear();
    }

    public void displayAllPolicies() {
        orderedPolicyMap.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        InsuranceSystem system = new InsuranceSystem();

        system.addPolicy(new InsurancePolicy("P1001", "Alice", "2025-12-31", "Health", 1200));
        system.addPolicy(new InsurancePolicy("P1002", "Bob", "2024-06-15", "Auto", 800));

        System.out.println("All Policies:");
        system.displayAllPolicies();

        System.out.println("\nPolicies Expiring Soon:");
        system.getPoliciesExpiringSoon().forEach(System.out::println);

        System.out.println("\nPolicies for Alice:");
        system.getPoliciesByHolder("Alice").forEach(System.out::println);

        System.out.println("\nRemoving Expired Policies...");
        system.removeExpiredPolicies();
        system.displayAllPolicies();
    }
}