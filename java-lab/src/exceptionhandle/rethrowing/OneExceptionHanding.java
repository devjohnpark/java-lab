package exceptionhandle.rethrowing;

public class OneExceptionHanding {

    public static void method() {
        try {
            // NullPointerException 예외 던지기
            if (true) {
                throw new NullPointerException("널 포인터 예외 발생");
            }
        } catch (NullPointerException e) {
            // 예외를 로깅하거나 다른 작업 수행
            e.printStackTrace();

            // 예외를 다시 던지기
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (NullPointerException e) {
            // 호출한 메서드에서 예외 처리
            e.printStackTrace();
        }
    }
}

