package com.infoshareacademy.task16;

import java.util.ArrayList;
import java.util.List;

public class StackClass implements Stack {
    List<Object> stack = new ArrayList<>();
    @Override
    public void push(Object o) {
        stack.add(o);
    }

    @Override
    public Object pop() {
        Object obj = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return obj;
    }
    public void print(){
        System.out.println(stack.get(stack.size()-1));
    }
    @Override
    public Object peek() {
        return null;
    }
}
