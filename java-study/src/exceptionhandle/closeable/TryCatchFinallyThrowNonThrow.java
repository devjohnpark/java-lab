package exceptionhandle.closeable;


public class TryCatchFinallyThrowNonThrow {
    public static void main(String[] args) {
        try {
//            method1();
//            method2();
            method3();
//            method4();
        } catch (RuntimeException e) {
            System.out.println("main - ");
            e.printStackTrace();
            System.out.println();
        }
    }

    // try 블럭과 finally 블럭에서 모두 예외가 발생되지만, 호출한 메서드로 하나의 예외만 던질수 있기 때문에
    // 늦게 발생한 finally 블럭의 예외가 try 블럭에서 발생한 예외를 덮어씌우며, 이렇게 덮어씌워진 예외를 던진다.
    public static void method1() throws RuntimeException {
        try {
            int[] arr = new int[5];
            int x = arr[6];
        } finally {
            int x = 0;
            int y = 10 / x;
        }
    }

    // 위와 동일하게 늦게 발생한 finally 블럭의 예외가 try 블럭에서 발생한 예외를 덮어씌우며, 이렇게 덮어씌워진 예외를 던진다.
    public static void method2() throws RuntimeException {
        try {
            int[] arr = new int[5];
            int x = arr[6];
        } catch (RuntimeException e) {
            System.out.println("try - catch");
            throw e;
        } finally {
            int x = 0;
            int y = 10 / x;
        }
    }

    // try 블럭에서 예외를 던지고 finally 블럭에서 발생한 예외는 catch 블럭에서 예외를 처리한다.
    public static void method3() throws RuntimeException {
        try {
            int[] arr = new int[5];
            int x = arr[6];
        } finally {
            try {
                int x = 0;
                int y = 10 / x;
            } catch (RuntimeException e) {
                System.out.println("finally - try - catch");
            }
        }
    }

    // try 블럭에서 발생한 예외는 catch 블럭에서 잡고, finally 블럭에서 발생한 예외는 호출한 메서드로 던진다.
    public static void method4() throws RuntimeException {
        try {
            int[] arr = new int[5];
            int x = arr[6];
        } catch (RuntimeException e) {
            System.out.println("try - catch");
            e.printStackTrace();
        } finally {
            int x = 0;
            int y = 10 / x;
        }
    }
}
