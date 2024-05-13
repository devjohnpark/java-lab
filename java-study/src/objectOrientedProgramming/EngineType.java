package objectOrientedProgramming;

public enum EngineType {
    FOUR_CYLINDER(4),
    EIGHT_CYLINDER(8),
    TWELVE_CYLINDER(12);

    private final int cylinders;

    EngineType(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }
}
