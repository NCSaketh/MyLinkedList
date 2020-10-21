package com.cg.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    MyLinkedList ll =new MyLinkedList();

    @Test
    public void WhenSearchElementFound() {
        ll.append(56);
        ll.append(30);
        ll.append(70);
        Assert.assertTrue(ll.search(30));
    }

    @Test
    public void WhenSearchElementNotFound() {
        ll.append(56);
        ll.append(30);
        ll.append(70);
        Assert.assertFalse(ll.search(15));
    }
}
