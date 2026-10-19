package LLD.WithStrategyPattern;

import LLD.WithStrategyPattern.Strategy.SportsDriveStrategy;


public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
