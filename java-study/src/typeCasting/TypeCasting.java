package typeCasting;

import integers.Integers;

public class TypeCasting {
    public static void main(String[] args) {
        double d = 65.1;

        // Type Casting 순차적 연산 과정
        // int num = (int)10.1; -> 변수 d의 값을 읽어 와서 type casting
        // int num = 10; -> type casting한 연산 결과 10을 변수 num에 저장
        // 따라서 변수 d의 값은 type casting 이후에도 값의 변화가 없다.
        int num1 = (int) d; // (type): Cast Operator
        System.out.printf("double %f -> int %d\n", d, num1); // double 65.100000 -> int 65

        char ch = (char) num1;
        System.out.printf("int %d -> char %c\n", num1, ch); // int 65 -> char A

        int num2 = (int) ch;
        System.out.printf("ch %c -> int %d\n", ch, num2); // ch A -> int 65

        float f = (int) num2;
        System.out.printf("int %d -> float %f\n", num2, f); // int 65 -> float 65.000000
    }
}
