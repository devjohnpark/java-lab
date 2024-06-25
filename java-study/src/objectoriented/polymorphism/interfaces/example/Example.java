package objectoriented.polymorphism.interfaces.example;

public interface Example {
    // 멤버는 상수만 가능하고 메서드는 body가 없는 추상 메서드와 body가 잇는 static 혹은 default 메서드르 가질수 있다.
    // 접근 제어자는 public과 default가 가능하며, 생략된 제어자(접근 제어자 또는 그 외의 제어자)는 컴파일러가 자동 완성해준다.
    // 멤버 변수는 public static final 이어야 하고 메서드는 public abstract 어야야하며, 이를 생략할 수 있다. (단, static 메서드와 default 메서드 제외)

    public static final int x = 10;
    int y = 20; // public static final int y = 20;
    final int z = 30; // public static final int z = 30;
    static int p = 40; //public static final int p = 40;

    public static String getHello() {
        return "Hello World";
    }

    public abstract int getX();

    int getY(); // public abstract int getY();

    abstract int getZ(); // public abstract int getZ();

    // public static void getHi()
    static void getHi() {
        System.out.println("Hi");
    }

    // public default void getHalo()
    default void getHalo() {
        System.out.println("Halo");
    }
}
