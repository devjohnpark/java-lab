package ExceptionHandle;

public class Throw {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킨 예외"); // 문자을 Exception 인스턴스의 message에 저장
            throw e; // Error와 Exception 클래스의 최상위 계층은 Throwable 클래스이다. 즉, Error나 Exception 던져서 catch 한다는 의미이다.
//            throw new Exception("고의로 발생시킨 예외"); // 위에 두줄을 한줄로 표현
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
