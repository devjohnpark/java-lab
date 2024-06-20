package objectoriented.inheritance.childparent;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child(1, 2, 3);
        Parent.e(); // Parent 클래스의 static method 호출
        parent.c(); // Parent 클래스의 method 호출
        parent.d(); // 오버라이드된 Child 클래스의 method 호출
//        parent.f(); // Child 클래스의 method 호출 불가

        Child child = new Child(1, 2, 3);
        Child.e(); // Parent 클래스의 static method 호출
        child.c(); // Parent 클래스의 method 호출
        child.d(); // 오버라이드된 Child 클래스의 method 호출
        child.f(); // Child 클래스의 method 호출

        child.method();
        Parent.staticmethod();
        Child.staticmethod();
    }
}
