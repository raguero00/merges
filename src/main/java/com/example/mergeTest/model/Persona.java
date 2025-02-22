package com.example.mergeTest.model;

public class Persona {

    private String name;
    private int age;

    public Persona() {
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
