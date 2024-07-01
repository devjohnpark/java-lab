package ExceptionHandle;

public class ThrowToMethod3 {
    public static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생한 호출 스택(Call Stack)에 있었던 메서드의 정보와 예외 메세지를 한번에 출력
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
