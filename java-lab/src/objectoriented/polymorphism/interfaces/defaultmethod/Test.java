package objectoriented.polymorphism.interfaces.defaultmethod;

public class Test {
    public static void main(String[] args) {
        IDefault1 iDefault1 = new Child();
        iDefault1.defaultMethod1();

        Parent p = new Parent();
        p.defaultMethod1();

        Child c = new Child();
        c.defaultMethod3();

//        System.out.println(c.x);
    }
}
