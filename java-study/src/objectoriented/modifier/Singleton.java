package objectoriented.modifier;

// 생성자가 private인 클래스를 상속받은 하위클래스의 인스턴스를 생성할때, 상위 클래스의 생성자 호출이 불가하여 인스턴스 생성 불가
// 그리하여 상속할 수 없는 클래스라는 것을 알리기 위해서 final로 클래스를 지정해줘야한다.
final class Singleton {
    private static Singleton s = new Singleton(); // 클래스의 인스턴스 개수 한개로 제한
    private Singleton() {}

    // 인스턴스를 생성하지 않고도 호출할수 있어야 하므로 static 메서드로 선언해야한다.
    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}
