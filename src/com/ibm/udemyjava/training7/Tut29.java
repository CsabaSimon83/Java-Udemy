package com.ibm.udemyjava.training7;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class Tut29 {
    public static void main(String[] args) {

        ////////////// Before Java 5 /////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orgage");

        String fruit = (String)list.get(1);
        System.out.println(fruit);

        ///////////// Modern Style /////////////////

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animals = strings.get(1);
        System.out.println(animals);

        /////////// There can be more than 1 type arguments //////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        /////////// Java 7 style /////////////
        ArrayList<Animal> somelist = new ArrayList<>();


    }
}
