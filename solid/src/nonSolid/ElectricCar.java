package nonSolid;

public class ElectricCar extends Car {
    private final SuperCharger superCharger;
    public ElectricCar(SmartDoor smartDoor, SmartBoot smartBoot, ElectricEngine electricEngine, PowerSteering steer, String model, String brand, SuperCharger superCharger) {
        super(electricEngine, smartDoor, smartBoot, steer, model, brand);
        this.superCharger = superCharger;
    }

    public void charge() {
        superCharger.charge();
    }

    @Override
    public void fillFuel() {

    }
}
