package exceptionhandle.trycatchfinally;

public class Finally {
    public static void main(String[] args) {
            try {
                method1();
                method2();
            } catch (Exception e) {
                e.printStackTrace();
                method2();
            } finally {
                method2();
            }
    }

    public static void method1() throws Exception {}

    public static void method2() {}
}
