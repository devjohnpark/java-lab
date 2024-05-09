package variable;

public class Specifier {
    public static void main(String[] args) {
        double d = 1.23456789;
        System.out.printf("%f\n", d); // 소수점 6째 자리 까지
        System.out.printf("%14.10f\n", d); // 전체 14자리 중에서 소수점 아래 10자리 (  1.2345678900 -> 공백 포함 14자리 중에 소수점 10자리)
        System.out.printf("%f\n", d); // 소수점 6째 자리 까지
        System.out.printf("%e\n", d); // 지수 형식
        System.out.printf("%E\n", d); // 지수 형식
        System.out.println(d); // 그대로 값 출력

        int i = 15;
        System.out.printf("%d\n", i); // 10진수
        System.out.printf("[%5d]\n", i); // [   15]
        System.out.printf("[%-5d]\n", i); // [15   ]
        System.out.printf("oct %o\n", i); // 8진수 oct 17
        System.out.printf("hex %x\n", i); // 16진수 hex f
        System.out.printf("%#x\n", i); // 16진수 0xf
        System.out.printf("%X\n", i); // 16진수
        System.out.printf("%#X\n", i); // 16진수

        long big = 100_000_000_000L; // 100000000000L

        System.out.printf("%d\n", big); // 100000000000

        System.out.printf("binary %s\n", Integer.toBinaryString(i)); // binary 1111

        char c = 'A';
        System.out.printf("%c\n", c);

        String s = "Hello World";
        System.out.printf("%s\n", s);
        System.out.printf("[%20s]\n", s); // [         Hello World]
        System.out.printf("[%-20s]\n", s); // [Hello World         ]
    }
}
