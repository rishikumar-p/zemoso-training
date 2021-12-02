package nonSolid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car implements Vehicle {
    private Engine engine;
    private SmartDoor smartDoor;
    private SmartBoot smartBoot;
    private PowerSteering steer;
    private String model;
    private String brand;

    @Override
    public void openBoot() {
        smartBoot.openBoot();
    }

    @Override
    public void openDoor() {
        smartDoor.openDoor();
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
}
