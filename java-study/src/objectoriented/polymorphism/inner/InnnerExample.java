package objectoriented.polymorphism.inner;

public class InnnerExample1 {
    private int outerInstanceVariable = 1;
    static int outerStaticVariable = 1;

    // 외부 클래스 인스턴스 멤버와 stiac 멤버 모두 접근 가능
    class InstanceInner {
        int instanceVariable = outerInstanceVariable;
        static int staticVariable = outerStaticVariable; //
    }

    // 외부 클래스의 static 멤버만 접근 가능
    static class StaticInner {
        int instanceVariable = outerStaticVariable;
        static int staticVariable = outerStaticVariable;
    }

    // 인스턴스 멤버간에는 직접 접근 가능
    InstanceInner instanceInner = new InstanceInner();

    // static 멤버간에는 직접 접근에 가능
    StaticInner staticInner = new StaticInner();

    static void staticMethod() {
        // static 메서드에서는 인스턴스 멤버에 접근 불가능
//        InstanceInner instanceInner = new InstanceInner(); // compile error
        System.out.println(StaticInner.staticVariable);
        StaticInner staticInner = new StaticInner();
        System.out.println(staticInner.instanceVariable);
    }

    void instanceMethod() {
        // instance 메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능
        InstanceInner instanceInner = new InstanceInner();
        System.out.println(instanceInner.instanceVariable);

        StaticInner staticInner = new StaticInner();
    }

    void method() {
        int localVariable = 0;
        final int constLocalVariable = localVariable;

        class LocalInner {
            int instanceVariable = outerInstanceVariable;
            static int staticVariable = outerStaticVariable;
            final int constLocalVariable = localVariable;
        }

        LocalInner localInner = new LocalInner();

        System.out.println(LocalInner.staticVariable);
        System.out.println(localInner.instanceVariable);
    }
}
