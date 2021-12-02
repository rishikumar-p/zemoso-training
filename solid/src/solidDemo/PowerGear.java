package solidDemo;

public class PowerGear implements Gear {
    @Override
    public void increaseGear() {
        System.out.println("Increasing Gear");
    }

    @Override
    public void decreaseGear() {
        System.out.println("Decreasing Gear");
    }

    @Override
    public void goToNeutral() {
        System.out.println("Switching to Neutral");
    }
}
