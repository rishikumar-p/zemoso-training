package solidDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car implements Vehicle, DoorInterface, Boot {
    private DoorInterface doorInterface;
    private Boot boot;
    private Engine engine;
    private Steer steer;
    private String model;
    private String brand;

    @Override
    public void openBoot() {
        boot.openBoot();
    }

    @Override
    public void closeBoot() {
        boot.closeBoot();
    }

    @Override
    public void openDoor() {
        doorInterface.openDoor();
    }

    @Override
    public void closeDoor() {
        doorInterface.closeDoor();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void decelerate(){
        engine.decelerate();
    }

    public void stop(){
        engine.stop();
    }

    public void start(){
        engine.start();
    }

    @Override
    public void turnLeft(){
        steer.turnLeft();
    }

    @Override
    public void turnRight(){
        steer.turnRight();
    }


}
