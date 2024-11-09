package objectoriented.engine;

public class HybridEngine extends Engine {
    private String electricMotorType;

    public HybridEngine(int horsepower, String electricMotorType) {
        super(EngineType.HYBRID, horsepower);
        this.electricMotorType = electricMotorType;
    }

    public void electricMode() {
        System.out.println("Hybrid engine running in electric mode using " + electricMotorType + " motor.");
    }
}
