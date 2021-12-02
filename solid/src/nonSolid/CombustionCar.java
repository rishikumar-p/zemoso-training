package nonSolid;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CombustionCar extends Car {
    private final FuelFill fuelFill;
    public CombustionCar( FuelFill fuelFill, SmartDoor smartDoor, SmartBoot smartBoot, Engine engine,PowerSteering  steer, String model, String brand) {
        super(engine, smartDoor, smartBoot, steer, model, brand);
        this.fuelFill = fuelFill;
    }

    @Override
    public void start() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void fillFuel() {
        fuelFill.fillFuel();
    }

}
