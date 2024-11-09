package floatingpoint;

public class UnderOverflowNaN {
    public static void main(String[] args) {
        // float 최솟값은 1.4 * 2^-45 이므로, 2로 나누면 Underflow 발생
        float result1 = Float.MIN_VALUE / 2;
        System.out.println("Result1: " + result1); // 0.0 출력

        // 부호 없는 부동소수 0으로 나눠 양의 무한대
        float result2 = 1.0f / 0.0f;
        System.out.println("Result2: " + result2); // Infinity 출력

        // 부호 있는 부동소수 0으로 나눠 음의 무한대
        float result3 = -1.0f / 0.0f;
        System.out.println("Result3: " + result3); // -Infinity 출력

        // 0을 0으로 나눠 없는 수
        float result4 = 0.0f / 0.0f;
        System.out.println("Result4: " + result4); // NaN 출력
    }
}
