package com.training.collection;

import com.training.basics.Animal;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    // int - Integer
    // float - Float
    // double - Double
    // char - Char
    // long - Long
    // short - Short

    public static void main(String[] args) {
        List names = addNgetNames("Raju");
        System.out.println(names);

    }


    public static List addNgetNames(String name){

        List<String> names = new ArrayList<>();
        names.add(name);

        return names;
    }
}
