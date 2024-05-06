package integers;

import jdk.jfr.Unsigned;

public class Integers {

    public static String byteToBits(byte num) {
        return String.format("%8s", Integer.toBinaryString(num & 0xFF)).replace(' ', '0');
    }

    public static void printBits(byte num, String str) {
        System.out.println("Byte " + num + "의 이진수 표현: " + str);
    }

    public static void main(String[] args) {
        // byte: 1byte size (-2^7 ~ 2^7-1)
        byte min = -128;
        byte max = 127;

        System.out.println(--min); // 127
        System.out.println(++max); // -128

        byte signedNum = -128; // 10000000
        byte unsignedNum = 127; // 01111111
        String signedBinaryString = byteToBits(signedNum);
        String unsignedBinaryString = byteToBits(unsignedNum);

        printBits(signedNum, signedBinaryString); // Byte -128의 이진수 표현: 10000000
        printBits(unsignedNum, unsignedBinaryString); // Byte 127의 이진수 표현: 01111111
    }
}
