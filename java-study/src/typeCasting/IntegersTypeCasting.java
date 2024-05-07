package typeCasting;

import integers.Integers;

public class IntegersTypeCasting {
    public static void main(String[] args) {
        int overByteTypeValue = 256; // byte는 8bit 이므로, 256부터 자리수가 초과한다.
        byte b1 = (byte) overByteTypeValue;

        // overByteTypeValue 00000000000000000000000100000000 -> byte 00000000
        System.out.printf("overByteTypeValue %s -> byte %s\n", Integers.numToBits(overByteTypeValue), Integers.numToBits(b1));

        byte b2 = 127;
        int num3 = (int) b2;

        // byte 01111111 -> int 00000000000000000000000001111111
        System.out.printf("byte %s -> int %s\n", Integers.numToBits(b2), Integers.numToBits(num3));
    }
}
