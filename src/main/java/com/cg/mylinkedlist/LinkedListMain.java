package com.cg.mylinkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        //add
        MyLinkedList ll=new MyLinkedList();
        ll.add(70);
        ll.add(30);
        ll.add(56);
        ll.print();
        System.out.println("");

        //append
        MyLinkedList ll1 = new MyLinkedList();
        ll1.append(56);
        ll1.append(30);
        ll1.append(70);
        ll1.print();
        System.out.println("");

    }
}
