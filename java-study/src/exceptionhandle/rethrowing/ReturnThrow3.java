package exceptionhandle.rethrowing;

public class ReturnThrow3 {

    public static int method() throws Exception {
        try {
            int x= 0;
            int y= 10 / x;
        } catch (ArithmeticException e) {
            // 예외를 로깅하거나 다른 작업 수행
            e.printStackTrace();
        } finally {
            return 10;
        }
    }

    public static void main(String[] args) {
        int result = -1;
        try {
            result = method();
        } catch (Exception e) {
            // 호출한 메서드에서 예외 처리
            e.printStackTrace();
        }
        System.out.println(result);
    }
}

