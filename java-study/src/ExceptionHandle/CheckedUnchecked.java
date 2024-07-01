package ExceptionHandle;

public class CheckedUnchecked {
    public static void main(String[] args) {
        // Unchecked
        try {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (NullPointerException e) {

        } catch (ArithmeticException e) {

        }

        // Checked
        try { } catch (Exception e) {}
//        try {
//
//        } catch (IOException e) {
//
//        } catch (ClassNotFoundException e) {
//
//        }
//
    }
}
