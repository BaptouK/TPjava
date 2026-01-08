package org.example.TPInterface;

import java.util.List;

public class MissionControl {
    public static void startFlight(List<Flyable> vehicles){
        for (Flyable vehicle : vehicles){
            vehicle.show();
        }
    }

    public static void startDrive(List<Drivable> vehicles){
        for (Drivable vehicle : vehicles){
            vehicle.show();
        }
    }

    public static void startSwim(List<Swimmable> vehicles){
        for (Swimmable vehicle : vehicles){
            vehicle.show();
        }
    }
}
