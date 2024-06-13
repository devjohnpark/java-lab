package objectoriented.method;

public class RecursiveMethod {
    // 반복문
    public static int factorialIterative(int n) {
        if (n <= 0 || n > 12) { // 13!는 int 타입의 최대값인 20억 보다 크다.
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 재귀함수
    public static int factorialRecursive(int n) {
        if (n <= 0 || n > 12) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int factorial;
        int n = 5; // 팩토리얼을 구할 숫자

        factorial = factorialIterative(n);
        System.out.println("반복문을 사용한 " + n + "의 팩토리얼: " + factorial);

        factorial = factorialRecursive(n);
        System.out.println("재귀 함수를 사용한 " + n + "의 팩토리얼: " + factorial);
    }
}
