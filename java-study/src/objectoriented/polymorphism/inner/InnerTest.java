package objectoriented.polymorphism.inner;

public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

        InnnerExample innerExample1 = new InnnerExample();
        innerExample1.method();
    }
}
