package objectoriented.inheritance.childparent;

public class Parent extends GrandParent {
    int x;
    public int y;
    private int z;
    static int s = 100;

    static void staticmethod() {
        System.out.println("s " + s);  // x, y 5, 10
    }

    Parent(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void a() {
        System.out.println("Call Parent Method a");
    }

    private void b() {
        System.out.println("Call Parent Method b");
    }

    public void c() {
        System.out.println("Call Parent Method c");
    }

    public void d() {
        System.out.println("Call Parent Method d");
    }

    public static void e() {
        System.out.println("Static method in Parent c");
    }

    void method() {
        System.out.println("x, y " + x + ", " + y);
        System.out.println("x, y " + this.x + ", " + this.y);
    }
}