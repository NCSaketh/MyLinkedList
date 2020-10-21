package com.cg.mylinkedlist;

public class MyLinkedList {

    Node head;
    Node tail;

    public void add(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.nextNode=head;
            head=node;
        }
    }

    public void append(int data)
    {
        Node node=new Node(data);
        if(tail==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.nextNode=node;
            tail=node;
        }
    }

    public void print()
    {
        Node head= this.head;
        while(head!=null)
        {
            System.out.print(head.data+" -> ");
            head=head.nextNode;
        }
    }
}
