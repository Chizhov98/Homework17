package com.company;

public class SomeObject {
    private int id;
    private String name;
    private int count;

    public SomeObject(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + ", count=" + count + "]";
    }

}
