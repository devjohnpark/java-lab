package objectoriented.polymorphism.draw;

// 추상 클래스
abstract class Shape {
    // 추상 메서드
    public abstract void draw();
}

// Circle 클래스
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle 클래스
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Shape을 처리하는 클래스
class ShapeDrawer {
    // 부모 클래스 타입의 매개변수를 사용하여 다형성 적용
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        // 각각의 자식 클래스 객체를 생성
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        // 자식 클래스 객체를 부모 클래스 타입의 매개변수로 전달
        drawer.drawShape(myCircle);  // 출력: Drawing a Circle
        drawer.drawShape(myRectangle);  // 출력: Drawing a Rectangle
    }
}
