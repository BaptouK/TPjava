package org.example.TPInterface;

public class Drone implements Flyable {
    int id;

    public Drone(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("Drone " + this.id + " qui vole");
    }


}
