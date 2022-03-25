package com.example.demo.GreetingController;

public class Greeting {
    private final long id;
    private final String cont;

    public Greeting(long id, String cont) {
        this.id = id;
        this.cont = cont;
    }
    public long getId() {
        return id;
    }

    public String getCont() {
        return cont;
    }

}
