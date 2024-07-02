package exceptionhandle.trycatchfinally;

public class ExceptionFlow {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = x / 0;
                System.out.println(result);
            } catch (NullPointerException e) {
                if (e instanceof NullPointerException) {
                    System.out.println(e.getMessage()); // / by zero 출력
                    System.out.println(e.getClass().getName());
                }
            } catch (RuntimeException e) {
                if (e instanceof ArithmeticException) {
                    // java.lang.ArithmeticException: / by zero at ExceptionHandle.ExceptionFlow.main(ExceptionFlow.java:9)
                    e.printStackTrace();
                    System.out.println("예외 메세지: " + e.getMessage()); // / by zero 출력
                }
            }
        }
        System.out.println("Out try-catch");
    }
}
