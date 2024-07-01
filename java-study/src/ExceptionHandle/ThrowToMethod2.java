package ExceptionHandle;

public class ThrowToMethod2 {
    public static void method1() throws Exception{
        method2();
    }

    public static void method2() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        method1();
        System.out.println("after method1");
    }
}