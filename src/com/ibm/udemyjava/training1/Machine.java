package com.ibm.udemyjava.training1;

public class Machine implements Info {

    private int id = 7;

    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }

    public void start() {
        System.out.println("Machine started.");
    }
}
