package dev.batuhansener.java.datastructures.list.linkedlist;

public class Node{
    private int val;
    Node next;

    public Node(){};

    public Node(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString(){
        return val+" ";
    }

}
