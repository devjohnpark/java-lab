package objectoriented.polymorphism.interfaces.relation;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        IProvider i = new Provider();
//        user.method(i);
        IProvider i = new Provider();
        User user = new User(i);
        user.method();
        System.out.println(i.toString());

//        // 팩토리를 통해 의존성 주입
        IProvider ip = InstanceManager.getService("provider");
        User user1 = new User(ip);
        user1.method();
        System.out.println(ip.toString());

    }
}
