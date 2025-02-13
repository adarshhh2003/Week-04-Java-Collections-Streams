package com.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Student {
    private int rollNumber;
    private String name;
    private double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public void saveStudent(DataOutputStream dos) throws IOException {
        dos.writeInt(rollNumber);
        dos.writeUTF(name);
        dos.writeDouble(gpa);
    }

    public static Student readStudent(DataInputStream dis) throws IOException {
        int rollNumber = dis.readInt();
        String name = dis.readUTF();
        double gpa = dis.readDouble();

        return new Student(rollNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Student { Roll Number: " + rollNumber + " Name: " + name + " GPA: " + gpa + " }";
    }
}
