package solidDemo;

public class ChargeableElectricCar extends ElectricCar implements Charge {
    Charge charge;

    public ChargeableElectricCar(DoorInterface doorInterface, Boot boot, Charge charge, Engine engine, Steer steer, String model, String brand) {
        super(doorInterface, boot, engine, steer, model, brand);
        this.charge = charge;
    }
    @Override
    public void charge() {
        charge.charge();
    }

    @Override
    public void checkEngine() {
        System.out.println("Chargeable Electric Car Service Check");
    }

    @Override
    public int getRemainingRange() {
        return (getBatteryPercentage() + 10) *18;
    }

}
