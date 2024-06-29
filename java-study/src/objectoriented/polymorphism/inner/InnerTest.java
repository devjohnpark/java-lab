package objectoriented.polymorphism.inner;

public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

        InnnerExample innerExample = new InnnerExample();
        innerExample.method();

        InnnerExample.staticMethod();

        AnnonymousExample annonymousExample = new AnnonymousExample();
        System.out.println(annonymousExample.instanceVariable.getClass());
    }
}
