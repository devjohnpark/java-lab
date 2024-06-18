package objectoriented.inheritance;

public class Parent {
    int x;
    public int y;
    private int z;

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

    public static void d() {
        System.out.println("Static method in Parent c");
    }
}