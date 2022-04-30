package com.training.collection;

import com.training.basics.Animal;

import java.util.*;

public class CollectionTest {

    // int - Integer
    // float - Float
    // double - Double
    // char - Char
    // long - Long
    // short - Short

    public static void main(String[] args) {

        testQueue();

    }

    public static void testMap(){

    }

    public static void testQueue(){
       /* PriorityQueue<Integer> values = new PriorityQueue<>();

        values.add(10);
        values.add(50);
        values.add(15);

        System.out.println(values);
        System.out.println(values.peek());
        System.out.println(values.poll());
        System.out.println(values.peek());*/

        Deque<String> names = new ArrayDeque<>();

        names.add("Raju");
        names.add("Sai");
        names.add("Sarath");
        names.add("Mahesh");
        names.add("Raju");
        System.out.println(names);

        names.offerLast("Chandra");
        System.out.println(names);

        names.pollFirst();
        System.out.println(names);

        names.pollLast();
        System.out.println(names);

    }

    public static void testSetInterface(){

        /*Set<String> names = new LinkedHashSet<>();

        names.add("Raju");
        names.add("Sai");
        names.add("Sarath");
        names.add("Mahesh");
        names.add("Raju");

        final String[] namesarr = names.toArray(new String[names.size()]);

        System.out.println(names);
        System.out.println(namesarr);*/

        SortedSet<Integer> values = new TreeSet<>();

        values.add(3);
        values.add(2);
        values.add(5);
        values.add(1);
        values.add(2);

        System.out.println(values);

    }

    public static void testMethod(){
        // Stack implementation with ArrayList

        /*List<String> names = new ArrayList<>();
        names.add("raju");
        names.add("Sai");
        names.add("Sarath");
        names.add("Mahesh");
        System.out.println(names);
        final int size = names.size();
        names.remove(size-1);
        System.out.println(names);*/

        Stack<String> names = new Stack<>();
        names.push("Sai");
        names.push("Sarath");
        names.push("Chandra");
        names.push("Raju");

        System.out.println(names);

        names.pop();
        System.out.println(names);



    }


    public static List<String> addNgetNames(String name){

        List<String> names = new Vector<>();
        names.add(name);

        return names;
    }
}
