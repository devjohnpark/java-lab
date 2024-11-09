package objectoriented.polymorphism.interfaces.iauth;

import java.util.function.BiConsumer;

class AuthenticatorProxy implements IAuthenticator {
    private final IAuthenticator realIAuthenticator;

    public AuthenticatorProxy(IAuthenticator realIAuthenticator) {
        this.realIAuthenticator = realIAuthenticator;
    }

    @Override
    public void authenticate(String username, String useremail) {
//        realIAuthenticator.authenticate(username, useremail);
        measureExecutionTime(() -> realIAuthenticator.authenticate(username, useremail));
    }

    private void measureExecutionTime(Runnable method) {
        // 실행 시간 측정을 위한 시작 시간 기록
        long startTime = System.currentTimeMillis();

        method.run();

        // 실행 시간 측정을 위한 종료 시간 기록
        long endTime = System.currentTimeMillis();

        // 실행 시간 계산
        long duration = endTime - startTime;

        // 실행 시간 출력
        System.out.println(String.format("authenticate method execution time: %dms.\n", duration));
    }
}
