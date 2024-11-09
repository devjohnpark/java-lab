package operator;

// 연산자(operator)는 연산(Operation)을 수행하는 기호를 말한다.
// '+' 기호를 덧셈 연산자(Addition Opeator)라 한다.
// 사칙 연산자는 +, -, *, / 등 다양한 연사자들이 있다.

import integers.Integers;

import java.util.Random;

public class Operator {
    public static void main(String[] args) {
//        int n = 10;
//        int x = n + 10;
//
//        if (x == n + 10) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
//
//        // 1101 = 13
//        // 1001 = 9
//        // 1001 = 9
//        System.out.println(13 & 9);


//        int x = 10;
//        float y = 13.21f;
//        float result = x + y; // 23.21
//        System.out.println(result);


        // ++: 수식 연산 후, --: 수식 연산 전
        // --수식 연산 하기전에 그전 수식이 수행되야하므로 + 1 후에 - 1하여  결과값은 0
//        System.out.println(x++ - --x);
//        int x = 10;
//        float y = 13.21f;
//        int result = x + (int) y;
////        System.out.println(result);
////        int result = x + y;


//        int x = 3;
//        int y = 2;
//        float result = x / (float) y ; // 1.5 (변수 x가 float으로 자동 타입 캐스팅 되어 연산)
//        System.out.println(result);
//
//        int n = 3;
//        int m = 0;
//        if (n/m == 10) {
//            System.out.println("sucess");
//        }
//        System.out.println(n/m);

        byte x = 1;
        byte y = 2;
//        byte z = (byte) (x + y);
        int z = x + y;
        System.out.println(z);


        char c1 = 'a';
        char c2 = (char) (c1 + 1);
        char c3 = 'a' + 1;
        System.out.println(c3);


        int i1 = 0xA; // 10(10) 1010(2)
        int i2 = 0x3; //  3(10) 0011(2)
        System.out.println(i1 | i2); // 11(10) 1011(2)
        System.out.println(i1 & i2); // 2(10) 10(2)
        System.out.println(i1 ^ i2); // 9(10) 1001(2)


        Random random = new Random(); // Random 객체 생성
        int publicKey = random.nextInt(100);  // 0부터 99까지의 정수 난수 생성
        int encryptingData = 100;

        int encryptedData = encryptingData ^ publicKey;
        int decryptedData = encryptedData ^ publicKey;

        System.out.printf("%d, %d\n", encryptingData, decryptedData);


        // 11111111111111111111111111111011
        int signedNum = -5; // -5를 나타내는 이진수는 11111011
        int complementOfOne = ~signedNum;
        System.out.println(complementOfOne);

        int complementOfTwo = complementOfOne + 1;
        System.out.println(complementOfTwo);


        System.out.println();
        System.out.println(Integers.numToBits(signedNum));
        int shiftedResult = signedNum >>> 29; // 오른쪽으로 29비트 시프트
        System.out.println(shiftedResult); // 결과 출력

        System.out.println(Integer.toBinaryString(-5 & 0xFFFFFFF));
    }
}
