package objectoriented.polymorphism.interfaces.iauth;

// 애플 권한에 대한 기능을 수행하는 클래스
class AppleAuth implements IAuth {
    private int appleID;

    @Override
    public void checkAuth() {
        // 애플 계정 권한 조회 로직
        System.out.println("Check auth with appleID: " + appleID);
    }
}
