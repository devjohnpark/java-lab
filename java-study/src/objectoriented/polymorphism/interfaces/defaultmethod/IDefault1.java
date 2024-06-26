package objectoriented.polymorphism.interfaces.defaultmethod;

public interface IDefault1 {

    void method1();

    // 일반 메서드이기 때문에 인터페이스 구현한 클래스에서 오버라이딩 안해도됨
    default void defaultMethod1() {
        System.out.println("Default method 1");
    }
}
