package org.example.TPInterface;

public class AmphibiousDrone implements Flyable, Swimmable {
    int id;

    public AmphibiousDrone(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("Drone amphibien " + this.id + " qui vole et nage ");
    }
}
