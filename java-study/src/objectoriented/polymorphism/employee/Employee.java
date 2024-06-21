package objectoriented.polymorphism.employee;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void printInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
    }

    void work() {
        System.out.println("Employee is working");
    }
}