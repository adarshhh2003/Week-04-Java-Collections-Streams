package com.universitymanagement;

public class UniversityManagement {
    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog();

        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> historyCourse = new Course<>("History", new AssignmentCourse());
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence", new ResearchCourse());

        catalog.addCourse(mathCourse);
        catalog.addCourse(historyCourse);
        catalog.addCourse(aiCourse);

        System.out.println("University Course Catalog");
        catalog.showCourses();
    }
}
