package dev.batuhansener.java.datastructures.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> deneme = new HashMap();

        deneme.put(1, "Bir");
        deneme.put(2, "Iki");
        deneme.put(3, "Three");
        deneme.put(4, "four");

        deneme.putIfAbsent(4,"Four");


        Set set = deneme.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            System.out.println(deneme.get(a));
        }

        System.out.println();
        deneme.forEach((k, v) -> System.out.println((k + ":" + v)));

        System.out.println();
        deneme.replace(4,"five","Five");
        deneme.remove(1);
        deneme.remove(3,"iki");

        deneme.forEach((k, v) -> System.out.println((k + ":" + v)));

        System.out.println();
        deneme.replace(4,"four","Four");

        deneme.forEach((k, v) -> System.out.println((k + ":" + v)));
    }
}
