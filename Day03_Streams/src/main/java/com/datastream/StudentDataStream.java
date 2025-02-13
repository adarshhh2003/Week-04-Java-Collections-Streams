package com.datastream;

import java.io.*;

public class StudentDataStream {
    public static void saveStudents(String filePath) {

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            Student s1 = new Student(101, "Uday", 7.5);
            Student s2 = new Student(102, "Sanket", 7.8);
            Student s3 = new Student(103, "Ankit", 6.5);

            s1.saveStudent(dos);
            s2.saveStudent(dos);
            s3.saveStudent(dos);

            System.out.println("Student data successfully written to the file");
        } catch (IOException e) {
            System.out.println("Error writing the data: " + e.getMessage());
        }
    }

    public static void loadStudents(String filePath) {

        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Student data retrieved");

            while(dis.available() > 0) {
                Student student = Student.readStudent(dis);
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/datastream/file.txt";

        saveStudents(filePath);
        loadStudents(filePath);
    }
}
