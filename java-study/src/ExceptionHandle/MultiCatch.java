package ExceptionHandle;

public class MultiCatch {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = x / 0;
                System.out.println(result);
            } catch (ArithmeticException | NullPointerException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Out try-catch");
    }
}
