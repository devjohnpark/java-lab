package objectoriented.inheritance.childparent;

class Child extends Parent {
    int x = 5, y = 10;
    private String str;

    static int s = 100;

    static void staticmethod() {
        System.out.println("s " + s);  // x, y 5, 10
    }



    Child(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void d() {
        System.out.println("Call Child Method d");
    }

    public void f() {
        System.out.println("Parent fields " + x + " " + y);
        System.out.println("Call Child Method e");
    }

    @Override
    void method() {
        super.method();
        System.out.println("x, y " + this.x + ", " + this.y);
    }
}