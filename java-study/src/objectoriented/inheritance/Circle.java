package objectoriented.inheritance;

class Circle extends Shape {
    Point centerPoint; // 원점
    int r; // 반지름

    Circle() {
        this(new Point(0, 0), 0, "black");
    }

    Circle(Point centerPoint, int r, String color) {
        super(color);
        this.centerPoint = centerPoint;
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}
