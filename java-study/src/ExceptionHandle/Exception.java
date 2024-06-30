package ExceptionHandle;

public class Exception {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = x / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage()); // / by zero 출력
            }
        }
        System.out.println("Out try-catch");
    }
}
