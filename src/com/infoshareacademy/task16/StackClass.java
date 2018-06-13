package com.infoshareacademy.task16;

import java.util.ArrayList;
import java.util.List;

public class StackClass<K> implements Stack<K> {
    List<K> stack = new ArrayList<>();
    K obj;
    @Override
    public void push(K o) {
        stack.add(o);
    }

    @Override
    public K pop() {
        obj = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return obj;
    }
    @Override
    public K peek() {
      return stack.get(stack.size()-1);
    }
}
