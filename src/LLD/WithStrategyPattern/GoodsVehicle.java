package LLD.WithStrategyPattern;

import LLD.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle()
    {
        super(new NormalDriveStrategy());
    }
}
