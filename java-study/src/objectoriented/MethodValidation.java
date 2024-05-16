package objectoriented;

public class MethodValidation {

    float divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }

    public static void main(String[] args) {
        MethodValidation mv = new MethodValidation();
        mv.divide(10, 0);
    }
}