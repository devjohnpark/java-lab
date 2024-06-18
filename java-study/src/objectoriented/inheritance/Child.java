package objectoriented.inheritance;

class Child extends Parent {
    private String str;

    Child(int x, int y, int z) {
        super(x, y, z);
    }

    public void e() {
        System.out.println("Parent fields " + x + " " + y);
        System.out.println("Call Child Method e");
    }
}