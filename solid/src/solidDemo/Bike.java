package solidDemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bike implements Vehicle {

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    @Override
    public void checkEngine() {
        System.out.println(" Bike Service Check");
    }
}
