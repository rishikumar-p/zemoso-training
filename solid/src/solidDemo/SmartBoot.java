package solidDemo;

public class SmartBoot implements Boot {
    @Override
    public void openBoot() {
        System.out.println("Opening Boot");
    }

    @Override
    public void closeBoot() {
        System.out.println("Closing Boot");
    }
}
