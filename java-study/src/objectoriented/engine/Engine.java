package objectoriented.engine;

public abstract class Engine {
    private final EngineType engineType;
    private int horsepower;

    public Engine(EngineType engineType,int horsepower) {
        this.engineType = engineType;
        this.horsepower = horsepower;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

