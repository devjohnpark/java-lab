package typecasting;

import floatingpoint.FloatingPoint;

public class FloatingPointTypeCasting {
    public static void main(String[] args) {
        float ff = 0.1f / 0.3f;
        double dd = (float) ff;

        // 가수부 24번째 수부터 버려짐
        // 0    01111101 01010101010101010101010
        // 0 01111111101 0101010101010101010101000000000000000000000000000000
        System.out.println(FloatingPoint.numToBits(ff));
        System.out.println(FloatingPoint.numToBits(dd));

        double ddd = 0.1 / 0.3;
        float fff = (float) ddd;

        // 가수부 24번째에서 반올림
        // 0 01111111101 0101010101010101010101010101010101010101010101010110
        // 0    01111101 01010101010101010101011
        System.out.println(FloatingPoint.numToBits(ddd));
        System.out.println(FloatingPoint.numToBits(fff));

        double d1 = 3.4e39;
        float overUnsignedFloatValue = (float) d1;

        double d2 = -3.4e39;
        float overSignedFloatValue = (float) d2;

        double d3 = 1.4e-46;
        float underUnsignedFloatValue = (float) d3;

        double d4 = -1.4e-46;
        float underSignedFloatValue = (float) d4;

        System.out.println(overUnsignedFloatValue); // Infinity
        System.out.println(overSignedFloatValue); // -Infinity
        System.out.println(underUnsignedFloatValue); // 0.0
        System.out.println(underSignedFloatValue); // -0.0
    }
}
