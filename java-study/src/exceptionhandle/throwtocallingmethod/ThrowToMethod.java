package exceptionhandle.throwtocallingmethod;


public class ThrowToMethod {
    public static void method() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}