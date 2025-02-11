package com.resumescreeningsystem;

// Generic Resume class
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() { return candidateName; }
    public T getJobRole() { return jobRole; }

    @Override
    public String toString() {
        return "Resume: " + candidateName + " (Applying for: " + jobRole.getRoleName() + ")";
    }
}