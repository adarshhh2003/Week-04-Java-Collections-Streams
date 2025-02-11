package com.resumescreeningsystem;

import java.util.List;

// Resume Screening System
class ResumeScreening {
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing " + resume);
    }

    public static void processMultipleResumes(List<? extends Resume<? extends JobRole>> resumes) {
        System.out.println("Screening multiple resumes:");
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println("- " + resume);
        }
    }
}
