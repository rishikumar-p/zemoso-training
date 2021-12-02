package solidDemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CombustionCar extends Car implements FuelFilling, Gear {
    private final Gear powerGearMechanism;
    private final FuelFilling fuelFill;
    public CombustionCar(Gear powerGearMechanism, FuelFilling fuel, DoorInterface doorInterface, Boot boot, Engine engine, Steer steer, String model, String brand) {
        super(doorInterface, boot, engine, steer, model, brand);
        this.powerGearMechanism = powerGearMechanism;
        this.fuelFill = fuel;
    }

    @Override
    public void fillFuel() {
        fuelFill.fillFuel();
    }

    @Override
    public void increaseGear() {
        powerGearMechanism.increaseGear();
    }

    @Override
    public void decreaseGear() {
        powerGearMechanism.decreaseGear();
    }

    @Override
    public void goToNeutral() {
        powerGearMechanism.goToNeutral();
    }

    @Override
    public void checkEngine() {
        System.out.println(" Combustion Car Engine Check");
    }
}
