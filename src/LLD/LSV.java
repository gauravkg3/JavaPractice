package LLD;

import java.util.ArrayList;
import java.util.List;

public class LSV {

    public static void main(String[] args) {
        List<Vehicle> listOfVehicle = new ArrayList<>();
        listOfVehicle.add(new MotorCycle());
        listOfVehicle.add(new Car());
        listOfVehicle.add(new Cycle());

        for (Vehicle vehicle : listOfVehicle) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}

class Vehicle {
    public Integer getNumberOfVehicle() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}


class Cycle extends Vehicle {
    public Boolean hasEngine() {
        return null;
    }
}

class MotorCycle extends Vehicle {

}

class Car extends Vehicle {
    @Override
    public Integer getNumberOfVehicle() {
        return 4;
    }
}