package com.readinputfromconsole;

import java.io.*;

public class ReadInputFromConsole {
    public static void readAndWrite(String filePath) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter(filePath)) {
            String name;

            System.out.println("Enter your Name: ");
            name = br.readLine();

            String age;
            System.out.println("Enter your age: ");
            age = br.readLine();

            System.out.println("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write(name + System.lineSeparator());
            fw.write(age + System.lineSeparator());
            fw.write(language + System.lineSeparator());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        String filePath = "src/main/java/com/readinputfromconsole/file.txt";

        readAndWrite(filePath);
    }
}
