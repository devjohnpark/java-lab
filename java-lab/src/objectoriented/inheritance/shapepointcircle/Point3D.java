package objectoriented.inheritance.shapepointcircle;

class Point3D extends Point {
    int z;

    Point3D() {
        this(10, 10, 10);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    void getLocation() {
        System.out.println(x + ", " + y + ", " + z);
    }
}
