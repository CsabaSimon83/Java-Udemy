package com.ibm.udemyjava.training11.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tut33 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        // This won't be executed if exception is thrown
        System.out.println("Continuing....");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not fount: " + file);
        }
    }
}
