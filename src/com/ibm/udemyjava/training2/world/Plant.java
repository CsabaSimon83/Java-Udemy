package com.ibm.udemyjava.training2.world;

/*
 * private --- only within same class
 * public --- from anywhere
 * protected -- same class, subclass and same package
 * no modifier -- same package only
 */


public class Plant {
    //Bad practice
    public String name;

    //Accepatable practice --- it's final
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }

}
