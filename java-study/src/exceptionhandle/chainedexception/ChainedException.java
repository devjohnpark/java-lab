package exceptionhandle.chainedexception;

class InstallException extends Exception {
    InstallException(String message) { super(message); }
}

class SpaceException extends Exception {
    SpaceException(String message) { super(message); }
}

class MemoryException extends Exception {
    MemoryException(String message) { super(message); }
}

public class ChainedException {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        }
    }

    static void copyFiles() {
        // 파일들을 복사하는 코드
    }

    static void deleteFiles() {
        // 임시파일들을 삭제하는 코드
    }

    static boolean enoughSpace() {
        // 설치하는데 필요한 디스크 공간 확인
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리 공간 확인
        return false;
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("Exception occurred during installation");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("Exception occurred during installation");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("Not enough space");
        }

        if (!enoughMemory()) {
            throw new MemoryException("Not engouth memory");
//
//            MemoryException는 Exception의 자식이므로 반드시 예외처리해야하지만, RuntimeException으로 감싸버려 Unchecked 예외로 만듦
//            throw new RuntimeException(new MemoryException("Not engouth memory"));
        }
    }
}




