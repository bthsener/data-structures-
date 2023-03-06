package dev.batuhansener.java.datastructures.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExample implements Comparable<SetExample>{

    private String name;
    private String lastname;
    private int no;

    public String getName(){
        return  name;
    }

    public String getLastname(){
        return lastname;
    }

    public int no(){
        return no;
    }

    public SetExample(String name, String lastname, int no){
        this.name = name;
        this.lastname = lastname;
        this.no = no;
    }

//    public static SetExample getASet(){
//        SetExample setdeneme = null;
//        int randomNumber = (int) Math.random() * 5;
//
//        switch (randomNumber){
//            case 1:
//                setdeneme = new SetExample("batuhan","sener",1);
//                break;
//            case 2:
//                setdeneme = new SetExample("baatuhan","seener",2);
//                break;
//            case 3:
//                setdeneme = new SetExample("baaatuhan","seeener",3);
//                break;
//            case 4:
//                setdeneme = new SetExample("baaaatuhan","seeeener",4);
//                break;
//            case 5:
//                setdeneme = new SetExample("baaaaatuhan","seeeeener",5);
//                break;
//        }
//
//        return setdeneme;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetExample that = (SetExample) o;
        return no == that.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }

    @Override
    public String toString() {
        return "SetExample{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", no=" + no +
                '}';
    }

    @Override
    public int compareTo(SetExample o) {
        if (o.no>this.no){
            return -1;
        }else if(o.no<this.no){
            return 1;
        }else{
            return 0;
        }
    }

//    @Override
//    public int compareTo(SetExample o){
//        if (o.no>no){
//            return 1;
//        }else if(o.no<no){
//            return -1;
//        }else{
//            return 0;
//        }
//    }


//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
