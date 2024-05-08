package typeCasting;

public class ImplictTypeCasting {
    public static void main(String[] args) {

        float f = 11111111; // (float) 123 생략
        System.out.println(f); //123.0

//        char ch = 1000;
//        System.out.println(ch);
//        byte b = 1000;

        int x = 10;
        double d = 1.0 + x;

        System.out.println(d);
    }
}
