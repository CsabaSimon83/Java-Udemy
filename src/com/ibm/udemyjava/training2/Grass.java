package com.ibm.udemyjava.training2;

import com.ibm.udemyjava.training2.world.Plant;

public class Grass extends Plant {
    // Won't work -- Grass not in same package as plant, even thgouth it's a subclass
    // System.out.println(this.height);
}
