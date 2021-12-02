package solidDemo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class ElectricCar extends Car{
    private int batteryPercentage;
    private int remainingRange;
    private int batteryTemperature;

    public ElectricCar(DoorInterface doorInterface, Boot boot, Engine engine, Steer steer, String model, String brand) {
        super(doorInterface, boot, engine, steer, model, brand);
        batteryPercentage = 0;
        remainingRange = 0;
        batteryTemperature = 0;

    }
    public int getBatteryPercentage(){
        return batteryPercentage;
    }

    public int getBatteryTemperature() {
        return batteryTemperature;
    }

    public boolean isBatteryOverHeating(){
        return batteryTemperature > 45;
    }

    public abstract int getRemainingRange();


}
