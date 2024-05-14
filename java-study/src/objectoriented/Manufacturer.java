package objectoriented;

public enum Manufacturer {
    BMW("BMW"),
    MERCEDES_BENZ("Mercedes-Benz"),
    AUDI("Audi");

    private final String name;

    Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

