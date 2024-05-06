package floatingPoint;

public class DoubleToInt {
    public static void main(String[] args) {
        double x = 100.0;
        double y = 99.9;

        System.out.println(x - y); // 0.09999999999999432

        if (x - y == 0.1) {
            System.out.println("a - b == 0.1");
        } else {
            System.out.println("a - b != 0.1"); // a - b != 0.1 출력
        }

        long a = (int)(x * 10);
        long b = (int)(y * 10);
        double sub = (a - b) / 10.0;

        if (sub == 0.1) {
            System.out.println("a - b == 0.1"); // a - b == 0.1 출력
        } else {
            System.out.println("a - b != 0.1");
        }
    }
}
