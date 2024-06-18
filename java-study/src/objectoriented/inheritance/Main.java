package objectoriented.inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child(1, 2, 3);
        Parent.d(); // Parent 클래스의 static method 호출
        parent.c(); // Parent 클래스의 method 호출
//        parent.e(); // Child 클래스의 method 호출 불가

        Child child = new Child(1, 2, 3);
        Child.d(); // Parent 클래스의 static method 호출
        child.c(); // Parent 클래스의 method 호출
        child.e(); // Child 클래스의 method 호출

        Point point = new Point(1, 2);
        Circle circle = new Circle(point, 10, "yellow");
        System.out.println(circle.area());

    }
}
