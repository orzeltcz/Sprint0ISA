package com.infoshareacademy.task7;

public class Developer implements User {


    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    String rola;


    @Override
    public void showinfo() {
        System.out.println(rola);
    }
}
