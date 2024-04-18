package variable;

import org.w3c.dom.ls.LSOutput;

public class Var2 {
    public static void main(String[] args) {
        // 아래 처럼, 개발자가 고정된 값이 literal이라 한다. 따라서 변수의 값은 변하지만, literal 자체는 변하지 않는다.
        int a = 10;
        char b = 'a';
        double c = 3.14;
        float d = 3.14f;
        boolean e = true;
        String f = "hello"; // String만 대문자 인데, 이는 class이다.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
