package solidDemo;

public class SmartDoor implements DoorInterface{
    @Override
    public void openDoor() {
        System.out.println("Smart Door Opening");
    }

    @Override
    public void closeDoor() {
        System.out.println("Smart door Closing");
    }
}
