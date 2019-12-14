package com.ibm.udemyjava.training4;

class Plant {
    public static final int ID = 7;
    private String name;

    public String getData(){
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }

    public int calculateGrowthForecast(){
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Tut26 {
    public static void main(String[] args) {

    }
}
