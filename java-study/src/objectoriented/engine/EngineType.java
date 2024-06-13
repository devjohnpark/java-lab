package objectoriented.engine;

public enum EngineType {
    GASOLINE("가솔린"),
    DIESEL("디젤"),
    HYBRID("하이브리드"),
    ELECTRIC("전기");

    private final String value;

    EngineType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

