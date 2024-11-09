package exceptionhandle.rethrowing;

public class ReturnThrow1 {

    public static int method() {
        try {
            return 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 5;
        }
    }

    public static void main(String[] args) {
        int result = -1;
        try {
            result = method();
        } catch (RuntimeException e) {
            // 호출한 메서드에서 예외 처리
            e.printStackTrace();
            System.out.println(result);
        }
        System.out.println(result);
    }
}

