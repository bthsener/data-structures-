package dev.batuhansener.java.datastructures.list.linkedlist;

public class linkedlisttest {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.indiseEkle(1,0);
        linkedList.sonaEkle(5);
        linkedList.sonaEkle(10);
        linkedList.indiseEkle(999,0);
        linkedList.indiseEkle(-8,80);
        linkedList.indiseEkle(80,2);
        linkedList.indiseEkle(999,1);

        linkedList.bastanSil();
        linkedList.sondanSil();

        linkedList.indisiSil(1);

        linkedList.listele();



        System.out.println();



        //linkedList.tersCevirYaz();
    }
}
