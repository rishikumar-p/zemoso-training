package solidDemo;

public class CombustionEngine implements Engine, Gear {
    Gear gear;

    @Override
    public void start() {
        System.out.println("Starting Combustion Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Combustion Engine");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating Combustion Engine");
    }

    @Override
    public void stop(){
        System.out.println("Stopping Combustion Engine");
    }


    @Override
    public void increaseGear() {
        gear.increaseGear();
    }

    @Override
    public void decreaseGear() {
        gear.decreaseGear();
    }

    @Override
    public void goToNeutral() {
        gear.goToNeutral();
    }
}


