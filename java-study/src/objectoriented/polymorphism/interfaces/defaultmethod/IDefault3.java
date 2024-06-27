package objectoriented.polymorphism.interfaces.defaultmethod;

public interface IDefault3 {
    public static final int x = 10;

    default void defaultMethod3() {
        System.out.println("IDefault3 Default method");
    }
}
