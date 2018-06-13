package com.infoshareacademy.task15;

import java.util.ArrayList;
import java.util.List;

public class QueueClass implements Queue {
    private List<Object> items = new ArrayList<>();
    private int size =0;
    @Override
    public void enqueue(Object o) {
        items.add(o);
        size++;
    }

    @Override
    public Object dequeue() {
        size--;
       Object obj = items.get(0);
        items.remove(0);
        return obj;
    }

    @Override
    public int size() {
        return size;
    }
}
