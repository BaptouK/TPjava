package org.example.TPInterface;

public class Submarine implements Swimmable {
    int id;

    public Submarine(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("Sous marin " + this.id + " qui nage");
    }

}
