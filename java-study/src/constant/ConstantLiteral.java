package constant;

/*
constant(상수)도 변수와 같이 값(데이터)을 저장할 수 있는 공간이다.
하지만 변수와 달리 다른 값으로 변경할 수 없다.
수학에서 상수는 1, 2, '123', 'A'와 같은 값들이 상수이지만, 프로그래밍에서는 상수를 값을 한번 저장하면 변경할 수 없는 저장 공간으로 정의하였다.
그러므로 프로그래밍에서는 상수(constant) 대신 리터럴(literal)이라 지었다. literal은 문자 그대로란 뜻이며, 수학의 상수와 같은 의미이다.
*/
public class ConstantLiteral {
    public static void main(String[] args) {
        final int MAX_INT = 1000; // constant는 upper case로 하는게 암묵적인 관례
        int max_int = 1000; // literal
        char ch = 'A'; // literal

        final int width = 10;
        final int height = 10;

        // 리터럴과 비교하면 상수는 값이 바뀌는 것을 예방하고, 여러 곳에서 값을 읽을 경우에 상수값만 변경해주어 수정이 편리하다.
        // 또한 변수의 이름으로 의미를 이해할수 있어 가독성이 좋아진다.
        int rectangleAreaLiteral = 10 * 10;
        int rectangleAreaConst = width * height;

        // Literal Type
        int octNum = 0101; // 8진수
        int hexNum = 0x10; // 16진수
        int binNum = 0b10; // 2진수 (0010도 가능)

        long big = 100_000_000_000L;
        long hex = 0xffff_ffff_ffff_ffffL;

        float pi1 = 3.14f; // 접미사 f가 붙지 않으면 생략 가능한 double으로 간주하여, 컴파일 에러 발생
        double pi2 = 3.14d; // (d 생략 가능)

        System.out.println(binNum);

        // 문자 리터럴, 문자열 리터럴
        char ch2 = 'd';

        // String은 클래스이므로, new 연산자를 통해 문자열 객체를 생성해야하지만 리터럴은 new 연산자 없이 저장이 허용된다.
        String str = "";
    }
}
