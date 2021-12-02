package nonSolid;

public class ServiceCheck {

    public void checkEngine(Vehicle vehicle){
        String className = vehicle.getClass().getName();
        switch(className) {
            case "CombustionCar": {
                System.out.println("Checking Combustion Car Engine");
                break;
            }
            case "ElectricCar": {
                System.out.println("Checking Electric Car Engine");
                break;
            }
            case "Bike": {
                System.out.println("Checking Bike Engine");
                break;
            }
            default:{
            }
        }
    }

}
