package floatingpoint;

public class FloatingPoint {
    public static String numToBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static String numToExponentBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static String numToMantissaBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static void main(String[] args) {
//        float floatValue = -112.8125f;
//        System.out.println(floatValue);
//
//        int intValue = Float.floatToIntBits(floatValue);
//        String binaryString = Integer.toBinaryString(intValue);
//        System.out.println("binaryString: " + binaryString);
//        binaryString = String.format("%32s", binaryString).replace(' ', '0');
//
//        System.out.println("Float value: " + floatValue); // 1.4E-45
//        System.out.println("Binary representation: " + binaryString); // 00000000000000000000000000000001
//
//        float unsignFloatMinValue = Float.MIN_VALUE; // 1.4E-45 (1.4e-45f)
//        float unsignFloatMaxValue = Float.MAX_VALUE; // 3.4028235E38
//        System.out.println("Unsign Float Min Value: " + unsignFloatMinValue);
//        System.out.println("Unsign Float Max Value: " + unsignFloatMaxValue);
//
//        float signFloatMinValue = -Float.MIN_VALUE;
//        float signFloatMaxValue = -Float.MAX_VALUE;
//        System.out.println("Sign Float Min Value: " + signFloatMinValue);
//        System.out.println("Sign Float Min Value: " + signFloatMaxValue);

//        // 지수부 비트 추출
//        float floatValue = -112.8125f;
//        int exponentBits = Float.floatToIntBits(floatValue); // float 타입을 값을 int 타입의 값으로 해석하여 반환
//        System.out.println("exponentBits " + exponentBits); // 0 01111110 01000000000000000000000 비트를 1063883029 정수로 출력
////        System.out.println("fdf" + FloatingPoint.numToBits(-112.8125f));
//        int exponent = (exponentBits >>> 23) & 0xFF; // 8비트가 모두 1로 이루어진 값인, 0xFF와 AND 연산하여 지수부 비트 추출
//        System.out.println(floatValue + " 지수부: " + (exponent - 127)); // 0.1101에서 1.101 x 2^-1으로 표현하여, 지수는 -1이다.
//
//        // 가수부 비트 추출
//        int mantissa = Float.floatToIntBits(exponentBits) & 0x7FFFFF; // 23비트가 모두 1로 이루어진 값인, 0x7FFFFF와 AND 연산하여 가수부 비트 추출
//        String binaryMantissa = Integer.toBinaryString(mantissa); // 가수 부분을 이진수 문자열로 변환
//
//        // 가수 부분을 23비트로 만들기 위해 공백을 0으로 대체
//        binaryMantissa = String.format("%23s", binaryMantissa).replace(' ', '0');
//        System.out.println(floatValue + "가수부: " + binaryMantissa);

//        float f31 = 123.4567f;
//        System.out.println(numToExponentBits(f31));
//        System.out.println(numToBits(f31));
//        0.00011001
//        00111101110011001100110011001101


        /* 부동 소수점 전체 추출 */

        float floatValue = -112.8125f;
        System.out.println("Decimal: " + floatValue); // -112.8125

        // int 타입 bit로 변환 (float와 int는 32bit로 동일한 크기)
        int intBits = Float.floatToIntBits(floatValue);

        // 부동 소수점 전체 이진수 문자열 변환 후, 32비트 중 뒷자리수 비트 공백일시 0으로 교체
        String binStr = String.format("%32s", Integer.toBinaryString(intBits)).replace(' ', '0');
        System.out.println("Binary: " + binStr); // 11000010111000011010000000000000


        /* 지수부와 지수 추출 */

        // 가수부 자리수인 23비트 오른쪽 시프트 연산 자리수 버리고, 0xFF(8bit 모두 1)와 AND 연산하여 지수부 비트 추출
        int exponent = (intBits >>> 23) & 0xFF; // 지수부

        // 지수부 이진수 문자열 변환 후, 지수부 8비트 추출 및 공백 0으로 대체
        String binExponent = String.format("%8s", Integer.toBinaryString(exponent)).replace(' ', '0');
        System.out.println(floatValue + "의 지수부 " + binExponent);

        // 지수부 = 지수 + bias 이기 때문에, float 타입의 bias 값 127을 뺀다.
        System.out.println(floatValue + "의 지수: " + (exponent - 127)); // 지수


        /* 가수부 비트 추출 */

        // 0x7FFFFF(23bit 모두 1)와 AND 연산하여 가수부 비트 추출
        int mantissa = intBits & 0x7FFFFF;

        // 가수부 이진수 문자열 변환 후, 23비트로 만들기 위해 뒷자리 공백을 0으로 대체
        String binMantissa = String.format("%23s", Integer.toBinaryString(mantissa)).replace(' ', '0');
        System.out.println(floatValue + "의 가수부: " + binMantissa);
    }
}