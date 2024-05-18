package objectoriented;

public class Overloading {
    int add(short a, short b) {
        System.out.println("Call int add(short a, short b)");
        return a + b;
    }

//    int add(int a, int b) {
//        System.out.println("Call int add(int a, int b)");
//        return a + b;
//    }

    // 매개변수의 개수는 같은데 타입이 다른 경우
    int add(int a, long b) {
        System.out.println("Call int add(int a, long b)");
        return (int) (a + b);
    }

    // 매개변수의 개수는 같은데 타입이 다른 경우
    int add(long a, long b) {
        return (int) (a + b);
    }

    // 매개변수 개수가 다른 경우
    int add(int a, int b, int c) {
        return a + b + c;
    }

//    // 매개변수의 타입과 개수는 동일한데, 반환 타입이 다른 경우
//    long add(int a, int b) {
//        return (long) (a + b);
//    }

//    // 매개변수의 타입과 개수는 동일한데, 변수명이 다른 경우
//    int add(int x, int y) {
//        return x + y;
//    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.add(10, 10));
    }
}
