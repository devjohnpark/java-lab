package exceptionhandle.trycatchfinally;

class Exception1 {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = x / (int) (Math.random() * 10);
                System.out.println(result); // 위의 코드에서 예외가 발생한다면, 즉각 catch 블럭으로 이동하여 해당 코드는 실행되지 않는다.
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage()); // / by zero 출력
            }
        }
        System.out.println("Out try-catch");
    }
}
