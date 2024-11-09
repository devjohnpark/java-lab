package exceptionhandle.rethrowing;

public class ReturnThrow2 {

    public static int method() throws Exception {
        try {
            int x= 0;
            int y= 10 / x;
            return y;
        } catch (ArithmeticException e) {
            throw new Exception();
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

