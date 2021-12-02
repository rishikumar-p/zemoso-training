package solidDemo;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Electric Engine");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating Electric Engine");
    }

    @Override
    public void stop(){
        System.out.println("Stopping Electric Engine");
    }
}
