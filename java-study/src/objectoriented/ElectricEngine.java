package objectoriented;

public class ElectricEngine extends Engine {
    private int batteryCapacity;

    public ElectricEngine(int horsepower, int batteryCapacity) {
        super(EngineType.ELECTRIC, horsepower);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        System.out.println("Electric engine charging.");
    }
}