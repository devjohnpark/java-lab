package objectoriented.polymorphism.interfaces.defaultmethod;

public class Parent implements IDefault1, IDefault2 {
    @Override
    public void method1() {
        System.out.println("Parent method");
    }

    // Default2와 IDefault1 인터페이스에서 중복된 디폴트 메서드를 가지므로, 오버라이딩을 통해 호출할 디폴트 메서드를 재정의한다.
    @Override
    public void defaultMethod1() {
        System.out.println("Parent default method 1");
    }

    // 부모 클래스의 메서드와 자식 클래스에서 구현한 인터페이스의 디폴트 메서드와 중복되어, 부모 클래스의 메서드가 상속됨 (상속이 구현보다 우선순위이다.)
    public void defaultMethod3() {
        System.out.println("Parent default method3");
    }
}
