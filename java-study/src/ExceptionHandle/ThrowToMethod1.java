package ExceptionHandle;

/*
java.lang.Exception
	at ExceptionHandle.ThrowToMethod1.method2(ThrowToMethod1.java:9)
	at ExceptionHandle.ThrowToMethod1.method1(ThrowToMethod1.java:5)
	at ExceptionHandle.ThrowToMethod1.main(ThrowToMethod1.java:14)
 */

public class ThrowToMethod1 {
    public static void method1() throws Exception{
        method2();
        System.out.println("Out try-catch");
    }

    public static void method2() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        try {
//            method1();
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생한 호출 스택(Call Stack)에 있었던 메서드의 정보와 예외 메세지를 한번에 출력
        }
    }
}
