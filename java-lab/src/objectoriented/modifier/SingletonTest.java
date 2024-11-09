package objectoriented.modifier;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // 동일한 인스턴스이므로 주소 동일
        System.out.println(s1);
        System.out.println(s2);
    }
}
