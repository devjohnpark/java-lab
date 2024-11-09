package objectoriented.polymorphism.inner;

public class Outer {
    int value = 10;
    class InstanceInner {
        int iv = 100;
        static int sv = 20;
        final int fiv = 0;

        int value = 10;

        void method() {
            int value = 1000;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);

        }
    }
    static class StaticInner {
        int st = 10;
        static int sv = 20;
    }

    void method() {
        final class LocalInner {
            static int sv = 20;
        }
    }
}
