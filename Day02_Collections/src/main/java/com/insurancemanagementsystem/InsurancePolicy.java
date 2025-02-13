package com.insurancemanagementsystem;

class InsurancePolicy {
        String policyNumber, policyholderName, coverageType;
        double premiumAmount;

        public InsurancePolicy(String policyNumber, String policyholderName, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        @Override
        public String toString() {
            return policyNumber + " - " + policyholderName + " - " + coverageType + " - $" + premiumAmount;
        }
}
