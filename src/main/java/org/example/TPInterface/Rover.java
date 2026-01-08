package org.example.TPInterface;

public class Rover implements Drivable {
    int id;

    public Rover(int id) {
        this.id = id;
    }

    @Override
    public void show(){
        System.out.println("Rover " + this.id + " qui roule");
    }

}
