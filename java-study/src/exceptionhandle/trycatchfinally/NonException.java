package exceptionhandle.trycatchfinally;

public class NonException {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = x / (int) (Math.random() * 10); /* Exception1 in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandle.NonException.main(NonException.java:8) */
            System.out.println(result);
        }
    }
}
