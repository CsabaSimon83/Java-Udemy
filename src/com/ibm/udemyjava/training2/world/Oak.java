package com.ibm.udemyjava.training2.world;

public class Oak extends Plant {
    public Oak() {
        // Won't work type is private
        // type = "tree";

        //This works -- size is protected, Oak is a subclass of plant.
        this.size = "large";

        // No access specier; works because Oak and Plant in same package
        this.height = 10;
    }
}
