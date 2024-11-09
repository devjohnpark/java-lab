package objectoriented.polymorphism.employee;

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Team size: " + teamSize);
    }

    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }

    void conductMeeting() {
        System.out.println("Manager is conducting a meeting...");
    }
}