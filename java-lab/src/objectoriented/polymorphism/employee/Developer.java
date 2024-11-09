package objectoriented.polymorphism.employee;

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    void work() {
        System.out.println("Developer is writing code");
    }

    void debugCode() {
        System.out.println("Developer is debugging code...");
    }
}
