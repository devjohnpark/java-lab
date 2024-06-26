package objectoriented.polymorphism.interfaces.iauth;

// 구글 권한에 대한 기능을 수행하는 클래스
class GoogleAuth implements IAuth {
    private int googleID;

    @Override
    public void checkAuth() {
        // 구글 계정 권한 조회 로직
        System.out.println("Check auth with googleID: " + googleID);
    }
}