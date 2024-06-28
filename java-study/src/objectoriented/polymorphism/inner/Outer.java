package objectoriented.polymorphism.inner;

public class Outer {
    class InstanceInner {
        int iv = 10;
        static int sv = 20;
        final int fiv = 0;
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
