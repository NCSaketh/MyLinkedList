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

    @Test
    public void InsertElementAfterElement() {
        ll.append(56);
        ll.append(30);
        ll.append(70);
        ll.Insert(30, 40);
        Assert.assertTrue(ll.search(40));
    }

    @Test
    public void DeleteElement() {
        ll.append(56);
        ll.append(30);
        ll.append(40);
        ll.append(70);
        ll.delete(40);
        Assert.assertFalse(ll.search(40));
        Assert.assertEquals(ll.size(),3);
    }
}
