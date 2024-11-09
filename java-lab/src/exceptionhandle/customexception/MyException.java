package exceptionhandle.customexception;

public class MyException extends Exception {
    /*
    예외 메시지 외에도 에러 코드를 사용하면, 동일한 예외 클래스 내에서도 다양한 오류 상황을 구별가능
    에러 코드에 따라 예외 처리를 다르게 처리 (에러 코드에 따라 다른 복구 절차를 수행 및 사용자에게 다른 메시지를 노출)
    따라서 예외에 대한 추가 정보를 제공하여 예외를 더 세밀하게 처리하고 디버깅 가능
     */
    private final int ERR_CODE; // 생성자를 통한 초기화 필요

    MyException(String message, int errCode) {
        super(message); // 예외 메서지 인스턴스에 저장
        ERR_CODE = errCode;
    }

    MyException(String message) {
        this(message, 100); // ERR_CODE 100으로 초기화
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}


