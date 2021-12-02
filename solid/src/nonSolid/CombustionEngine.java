package nonSolid;

public class CombustionEngine implements Engine {


    @Override
    public void start() {
        System.out.println("Starting Combustion Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Combustion Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Combustion Engine");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating Combustion Engine");
    }

    public void increaseGear() {
        System.out.println("Increasing Gear");
    }

    public void decreaseGear() {
        System.out.println("Decreasing Gear");
    }


    public void goToNeutral() {
        System.out.println("Switching to Neutral");
    }

}


