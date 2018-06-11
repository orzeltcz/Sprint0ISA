package com.infoshareacademy.task8;

public class Generic <T>{
    public Generic(T item) {
this.item = item;
    }

    public T item;
    public void getItem(){
        System.out.println(item.getClass());
    }

    }

