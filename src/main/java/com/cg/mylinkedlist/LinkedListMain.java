package com.cg.mylinkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        //add
        MyLinkedList ll=new MyLinkedList();
        System.out.println("Add");
        ll.add(70);
        ll.add(30);
        ll.add(56);
        ll.print();
        System.out.println("");

        //append
        MyLinkedList ll1 = new MyLinkedList();
        System.out.println("Append");
        ll1.append(56);
        ll1.append(30);
        ll1.append(70);
        ll1.print();
        System.out.println("");

        //add after a specific element
        System.out.println("Add after a specific element");
        MyLinkedList ll2 = new MyLinkedList();
        ll2.append(56);
        ll2.append(70);
        ll2.Insert(56,30);
        ll2.print();
        System.out.println("");

        //Deleting the first element using pop
        System.out.println("Deleting the first element using pop");
        ll2.pop();
        ll2.print();
        System.out.println("");

        //Popping last element
        MyLinkedList ll3=new MyLinkedList();
        System.out.println("Popping last element");
        ll3.add(70);
        ll3.add(30);
        ll3.add(56);
        ll3.print();
        System.out.println("");
        ll3.popLast();
        ll3.print();
        System.out.println("");
        System.out.println("***");

        //Insert 40 after 30
        System.out.println("Insert 40 after 30");
        ll.print();
        System.out.println("");
        ll.Insert(30,40);
        ll.print();
        System.out.println("");

        //Deleting element
        System.out.println("Deleting element");
        ll.delete(40);
        System.out.println("Linked List Size " + ll.size());
        ll.print();
        System.out.println("");

        //Sorting List while Adding
        System.out.println("Sorting while adding");
        MyLinkedList ll4=new MyLinkedList();
        ll4.addWithSort(56);
        ll4.addWithSort(30);
        ll4.addWithSort(40);
        ll4.addWithSort(70);
        ll4.print();
        System.out.println("");

    }
}
