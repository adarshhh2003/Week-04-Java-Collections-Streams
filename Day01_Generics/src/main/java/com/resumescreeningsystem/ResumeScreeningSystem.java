package com.resumescreeningsystem;

import java.util.Arrays;
import java.util.List;

// Main class to test implementation
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume1 = new Resume<>("Alice Johnson", new SoftwareEngineer());
        Resume<DataScientist> resume2 = new Resume<>("Bob Smith", new DataScientist());
        Resume<ProductManager> resume3 = new Resume<>("Charlie Brown", new ProductManager());

        ResumeScreening.processResume(resume1);
        ResumeScreening.processResume(resume2);
        ResumeScreening.processResume(resume3);

        List<Resume<? extends JobRole>> resumes = Arrays.asList(resume1, resume2, resume3);
        ResumeScreening.processMultipleResumes(resumes);
    }
}