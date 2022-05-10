package com.training.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopMapTest {



    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("iPhone", 80000);
        products.put("MacBook", 150000);

        // Get Keys
        final Set<String> keys = products.keySet();

        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext(); ) {

            String currentKey =  iterator.next();
            System.out.println(currentKey+" : "+products.get(currentKey));

        }
    }
}
