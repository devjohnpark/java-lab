package typeCasting;

import floatingPoint.FloatingPoint;
import integers.Integers;

public class IntFloatingPointTypeCasting {
    public static void main(String[] args) {
        int x = 9;
        float f = (float) x;

        // 10진수 int 9 -> float 9.000000
        System.out.printf("10진수 int %d -> float %f\n", x, f);

        // int 00000000000000000000000000001001 -> float 01000001000100000000000000000000
        System.out.printf("2진수 int %s -> float %s\n", Integers.numToBits(x), FloatingPoint.numToBits(f));

        System.out.println();

        int y = 33333333;
        float f2 = (float) y;
        double d = (double) y;

        // 10진수 int 33333333 -> float 33333332.000000
        System.out.printf("10진수 int %d -> float %f\n", y, f2);

        // 10진수 int 33333333 -> double 33333333.000000
        System.out.printf("10진수 int %d -> double %f\n", y, d);

        // int 00000001111111001010000001010101 -> float 01001011111111100101000000101010
        System.out.printf("int %s -> float %s\n", Integers.numToBits(y), FloatingPoint.numToBits(f2));

        // int 00000001111111001010000001010101 -> double 0100000101111111110010100000010101010000000000000000000000000000
        System.out.printf("int %s -> double %s\n", Integers.numToBits(y), FloatingPoint.numToBits(d));

        System.out.println();

        long z = 333333333333333333L;
        double dd = (double) z;

        // 10진수 long 333333333333333333 -> double 333333333333333300.000000
        System.out.printf("10진수 long %d -> double %f\n", z, dd);

        // long 0000010010100000001111001110011010001101001000010101010101010101 -> double 0100001110010010100000001111001110011010001101001000010101010101
        System.out.printf("long %s -> double %s\n", Integers.numToBits(z), FloatingPoint.numToBits(dd));

        System.out.println();

        double ddd = 1.777;
        int q = (int) ddd;

        // 10진수 double 1.777000 -> int 1
        System.out.printf("10진수 double %f -> int %d\n", ddd, q);

        // double 0100000101111111110010100000010101010000000000000000000000000000 -> int 00000001111111001010000001010101
        System.out.printf("2진수 double %s -> int %s\n", FloatingPoint.numToBits(ddd), Integers.numToBits(q));

    }
}
