package objectoriented.engine;

public class GasolineEngine extends Engine {
    private static double maxEmission = 4.6;

    public GasolineEngine(int horsepower) {
        super(EngineType.GASOLINE, horsepower);
    }

    private void ignite() {
        System.out.println("Internal combustion engine ignited.");
    }

    @Override
    public void start() {
        super.start();
        ignite();
    }

    public static void setMaxEmission(double newMaxEmission) {
        maxEmission = newMaxEmission;
    }
}