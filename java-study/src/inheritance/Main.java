package inheritance;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.a();
        obj.b(); // Child b호출

        Child.staticMethod();
    }
}
