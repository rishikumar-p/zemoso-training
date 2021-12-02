package solidDemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck implements Vehicle, DoorInterface {
    private Engine engine;
    private Steer steer;
    private String model;
    private String brand;

    @Override
    public void openDoor() {
        System.out.println("Opening Truck Door");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing Truck Door");
    }

    @Override
    public void turnLeft() {
        steer.turnLeft();
    }

    @Override
    public void turnRight() {
        steer.turnRight();
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

    @Override
    public void accelerate() {
        engine.accelerate();
    }

    @Override
    public void decelerate() {
        engine.decelerate();
    }

    @Override
    public void checkEngine() {
        System.out.println(" Truck Service Checl");
    }
}
