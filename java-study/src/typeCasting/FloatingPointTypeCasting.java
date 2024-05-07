package typeCasting;

import floatingPoint.FloatingPoint;

public class FloatingPointTypeCasting {
    public static void main(String[] args) {
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

//        double d = 9.1234567;
//        float f = (float) d;
        float f = 9.1234567f;
        double d = (float) f;
        System.out.println(FloatingPoint.numToBits(d));
        System.out.println(FloatingPoint.numToBits(f));
    }
}
