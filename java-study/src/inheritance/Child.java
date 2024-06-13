package inheritance;

class Child extends Parent {
    @Override
    public void b() {
        System.out.println("Call Child Method");
    }

    public static void staticMethod() {
        // 상위 클래스의 static 메서드를 호출
        Parent.staticMethod();
    }
}