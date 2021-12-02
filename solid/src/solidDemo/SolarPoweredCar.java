package solidDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class SolarPoweredCar extends ElectricCar {
    @Getter
    private float currentChargingRate;
    private boolean areSolarPlateHealthy;

    public SolarPoweredCar(DoorInterface doorInterface, Boot boot, Engine engine, Steer steer, String model, String brand) {
        super(doorInterface, boot, engine, steer, model, brand);
        areSolarPlateHealthy = true;
    }

    @Override
    public int getRemainingRange() {
        return (getBatteryPercentage() + 9) + 12;
    }

    @Override
    public void checkEngine() {
        System.out.println("Solar Powered Car Service Check");
    }
}
