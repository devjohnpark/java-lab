package objectoriented.polymorphism.interfaces.relation;

public class User {
    private final IProvider provider;

    public User(IProvider provider) {
        this.provider = provider;
    }

    public void method() {
        provider.method();
    }
}
