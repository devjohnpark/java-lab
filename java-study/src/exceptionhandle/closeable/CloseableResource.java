package exceptionhandle.closeable;

class WorkException extends Exception {
    WorkException(String message) { super(message); }
}

class CloseException extends Exception {
    CloseException(String message) { super(message); }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork 호출됨");
        if (exception) {
            throw new WorkException("Work Exception 발생");
        }
    }

    //  AutoCloseable 인터페이스의 close() 메서드 자동 오버라이딩
    public void close() throws CloseException {
        System.out.println("close() 호출됨");
        throw new CloseException("CloseException 발생");
    }
}

