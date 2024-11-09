package objectoriented.polymorphism.interfaces.defaultmethod;

// IDefault1와 중복된 디폴트 메서드를 가지는 인터페이스
public interface IDefault2 {
    // 일반 메서드이기 때문에 인터페이스 구현한 클래스에서 오버라이딩 안해도됨
    default void defaultMethod1() {
        System.out.println("Default method 2");
    }
}
