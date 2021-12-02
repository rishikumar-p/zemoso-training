package solidDemo;

public class Main {
    public static void main(String[] args){
        ServiceCheck serviceCheck = new ServiceCheck();

        System.out.println("--------Combustion Car------------");
        CombustionCar combustionCar = new CombustionCar(new PowerGear(), new ConventionalFuelFill(), new SmartDoor(), new SmartBoot(), new CombustionEngine(), new PowerSteering(), "Cherokee", "Jeep");
        combustionCar.start();
        combustionCar.accelerate();
        combustionCar.turnLeft();
        combustionCar.turnRight();
        combustionCar.decelerate();
        combustionCar.openDoor();
        combustionCar.openBoot();
        combustionCar.stop();
        combustionCar.fillFuel();
        combustionCar.increaseGear();
        combustionCar.decreaseGear();
        combustionCar.goToNeutral();
        serviceCheck.checkEngine(combustionCar);

        System.out.println();
        System.out.println("--------Chargeable Electric Car ------------");

        ChargeableElectricCar chargeableElectricCar = new ChargeableElectricCar(new SmartDoor(), new SmartBoot(),new FastCharger(), new ElectricEngine(), new PowerSteering(), "Model S", "Tesla");
        chargeableElectricCar.start();
        chargeableElectricCar.accelerate();
        chargeableElectricCar.turnLeft();
        chargeableElectricCar.turnRight();
        chargeableElectricCar.decelerate();
        chargeableElectricCar.openDoor();
        chargeableElectricCar.openBoot();
        chargeableElectricCar.stop();
        chargeableElectricCar.charge();
        System.out.println("Remaining Range: " + chargeableElectricCar.getRemainingRange());
        System.out.println("Battery Percentage: " + chargeableElectricCar.getBatteryPercentage());
        serviceCheck.checkEngine(chargeableElectricCar);

        System.out.println();
        System.out.println("--------Solar Powered Car------------");

        SolarPoweredCar solarCar = new SolarPoweredCar(new SmartDoor(), new SmartBoot(), new ElectricEngine(), new PowerSteering(), "Model S", "Tesla");
        solarCar.start();
        solarCar.accelerate();
        solarCar.turnLeft();
        solarCar.turnRight();
        solarCar.decelerate();
        solarCar.openDoor();
        solarCar.openBoot();
        solarCar.stop();
        System.out.println("Remaining Range: " +solarCar.getRemainingRange());
        serviceCheck.checkEngine(solarCar);

    }
}
