package objectoriented.modifier;

public class Parent {
    final int NUMBER;

    Parent(int number) {
        NUMBER = number;
    }

    final void method(int n) {
        final int num;
        num = NUMBER;
        if (num > n) {
//            num = n;
        }
    }

    public static void main(String[] args) {
        final Parent f1 = new Parent(1);
        final Parent f2 = new Parent(5);
        final Parent f3 = new Parent(10);
    }
}
