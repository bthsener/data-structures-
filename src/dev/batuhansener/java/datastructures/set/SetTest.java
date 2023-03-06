package dev.batuhansener.java.datastructures.set;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        Set<Object> deneme = new TreeSet<>();

//        int i = 0;
//        while (i<=10){
//            if(deneme.add(SetExample.getASet())) {
//                deneme.add(SetExample.getASet());
//            }
//            i++;
//        }
        SetExample nesne = new SetExample("batuhan","sener",1);

        deneme.add(nesne);
        deneme.add(new SetExample("baatuhan","seener",2));
        deneme.add(new SetExample("baaatuhan","seeener",3));
        deneme.add(new SetExample("baaaatuhan","seeeener",4));
        deneme.add(new SetExample("baaaaatuhan","seeeeener",5));

        Iterator iterator = deneme.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
