package integers;

import jdk.jfr.Unsigned;

public class Integers {
    public static String numToBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Byte) { // 8bit
            byte byteValue = (byte) number;
            strBits = String.format("%8s", Integer.toBinaryString(byteValue & 0xFF)).replace(' ', '0');
        } else if (number instanceof Short) { // 16bit
            short shortValue = (short) number;
            strBits = String.format("%16s", Integer.toBinaryString(shortValue & 0xFFFF)).replace(' ', '0');
        } else if (number instanceof Integer) { // 32bit
            int intValue = (int) number;
            strBits = String.format("%32s", Integer.toBinaryString(intValue & 0xFFFFFFFF)).replace(' ', '0');
        } else if (number instanceof Long) {
            long longValue = (long) number;
            strBits = String.format("%64s", Long.toBinaryString(longValue)).replace(' ', '0');
        }
        return strBits;
    }

    public static void main(String[] args) {
        // byte: 1byte size (-2^7 ~ 2^7-1)
        byte min = -128;
        byte max = 127;

        System.out.println(--min); // 127
        System.out.println(++max); // -128

        byte signedNum = -128; // 10000000
        byte unsignedNum = 127; // 01111111

        System.out.println("Byte -128의 이진수 표현: " + numToBits(signedNum)); // Byte -128의 이진수 표현: 10000000
        System.out.println("Byte 127의 이진수 표현: " + numToBits(unsignedNum)); // Byte 127의 이진수 표현: 01111111

    }
}
