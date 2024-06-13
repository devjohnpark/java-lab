package objectoriented.engine;

public class DieselEngine extends Engine {
    private static double maxEmission = 4.6;

    public DieselEngine(int horsepower) {
        super(EngineType.DIESEL, horsepower);
    }

    public void fuelInjector() {
        System.out.println("Fuel injected into diesel engine.");
    }

    public static void setMaxEmission(double newMaxEmission) {
        maxEmission = newMaxEmission;
    }
}
