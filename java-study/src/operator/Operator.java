package operator;

// 연산자(operator)는 연산(Operation)을 수행하는 기호를 말한다.
// '+' 기호를 덧셈 연산자(Addition Opeator)라 한다.
// 사칙 연산자는 +, -, *, / 등 다양한 연사자들이 있다.

public class Operator {
    public static void main(String[] args) {
        int n = 10;
        int x = n + 10;

        if (x == n + 10) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
