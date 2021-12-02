package solidDemo;

public class PowerSteering implements Steer{
    @Override
    public void turnLeft() {
        System.out.println("Turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right");
    }
}
