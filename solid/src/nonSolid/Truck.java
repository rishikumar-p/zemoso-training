package nonSolid;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck implements Vehicle {
    private FuelFill fuelFill;
    private CombustionEngine engine;
    private PowerSteering steer;
    private String model;
    private String brand;

    @Override
    public void openDoor() {
        System.out.println("Opening Truck Door");
    }

    @Override
    public void turnLeft() {
        steer.turnLeft();
    }

    @Override
    public void start() {
        engine.start();
    }


    @Override
    public void accelerate() {
        engine.accelerate();
    }



    public void fillFuel() {
        fuelFill.fillFuel();
    }

    @Override
    public void openBoot() {

    }

}
