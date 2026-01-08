package org.example.TPInterface;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args){
        System.out.println("Yo la team");

        Drone d1 = new Drone(1);
        Submarine s1 = new Submarine(2);
        Rover r1 = new Rover(3);
        AmphibiousDrone a1 = new AmphibiousDrone(4);

        List<Flyable> fliers   = new ArrayList<>();
        List<Swimmable> swimmers = new ArrayList<>();
        List<Drivable> drivers = new ArrayList<>();

        // Inscription selon capacités :
        fliers.add(d1);
        fliers.add(a1);

        swimmers.add(s1);
        swimmers.add(a1);

        drivers.add(r1);

        // Contrôle polymorphe :
        System.out.println("=== Séquence de vol ===");
        MissionControl.startFlight(fliers);

        System.out.println("=== Séquence de nage ===");
        MissionControl.startSwim(swimmers);

        System.out.println("=== Séquence de roulage ===");
        MissionControl.startDrive(drivers);

    }
}
