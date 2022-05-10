package com.training.iterator;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Sai");
        names.add("Sarath");
        names.add("Chandra");
        names.add("Raju");

        System.out.println(names);

        final int age = 30;
//        Iterator<String> iterator = names.iterator();
//
//        while(iterator.hasNext()){
//            final String next = iterator.next();
//            if(next.equals("Raju"))
//                i
//            else
//                System.out.println(next);
//        }

        for (final Iterator<String> stringIterator = names.iterator(); stringIterator.hasNext(); ) {
            String next =  stringIterator.next();
            System.out.println(next);
        }
        System.out.println(age);
//        System.out.println(names);
    }

}
