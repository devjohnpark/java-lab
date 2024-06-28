package objectoriented.polymorphism.inner;

public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
        
        InnnerExample1 innerExample1 = new InnnerExample1();
        innerExample1.method();
    }
}
