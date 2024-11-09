package objectoriented.inheritance.shapepointcircle;


public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Circle circle = new Circle(point, 10, "yellow");
        System.out.println(circle.area());

        Point3D point3D = new Point3D(1, 2, 3);
        Point3D point3D2 = new Point3D();
    }
}
