package objectoriented.polymorphism.interfaces.relation;

public class Provider implements IProvider {
    @Override
    public void method() {
        providerMethod();
    }

    private void providerMethod() {
        System.out.println("Provider method");
    }
}
