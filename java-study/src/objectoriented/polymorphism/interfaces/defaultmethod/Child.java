package objectoriented.polymorphism.interfaces.defaultmethod;

public class Child extends Parent implements IDefault3 {
    // 오버라이딩 안해도됨
    @Override
    public void defaultMethod1() {
        System.out.println("Child default method");
    }
}
