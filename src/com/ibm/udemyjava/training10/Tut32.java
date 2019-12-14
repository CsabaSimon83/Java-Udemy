package com.ibm.udemyjava.training10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tut32 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "src/com/ibm/udemyjava/training10/example.txt";

        File textfile = new File(filename);

        Scanner in = new Scanner(textfile);

        int value = in.nextInt();
        System.out.println(value);

        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }

        in.close();
    }
}
