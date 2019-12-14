package com.ibm.udemyjava.training9;

class Machine {
    public void start() {
        System.out.println("Staring machine ...");
    }
}

interface Plant{
    public void grow();
}

public class Tut31 {
    public static void main(String[] args) {
        Machine machine1 = new Machine() {
            @Override
            public void start(){
                System.out.println("Camera snapping  ....");
            }
        };
        machine1.start();

        Plant plant = new Plant(){

            public void grow() {
                System.out.println("Plant growing ...");
            }
        };

        plant.grow();
    }
}
