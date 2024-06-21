package objectoriented.polymorphism.employee;

public class Main {

    // 상위 클래스 타입의 참조 변수를 매개변수로 받는 메서드
    public static void processEmployee(Employee employee) {
        // 모든 하위 클래스의 인스턴스는 상위 클래스의 인스턴스를 포함하기 때문에, 조건식 true
        if (employee instanceof Employee) {
            System.out.println(employee.getClass());
            employee.printInfo(); // 인스턴스 변수 출력
            employee.work(); // 모든 Employee 객체가 공통적으로 가진 메서드 호출
        }

        // 하위 클래스인 Manager의 인스턴스인지 확인 후, 타입 캐스팅
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.conductMeeting(); // Manager 클래스에만 있는 메서드 호출
        }

        // 하위 클래스인 Developer의 인스턴스인지 확인 후, 타입 캐스팅
        if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            developer.debugCode(); // Developer 클래스에만 있는 메서드 호출
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Jin", 1);
        Employee manager = new Manager("Alice", 101, 5);
        Employee developer = new Developer("Bob", 202, "Java");

        processEmployee(employee);
        System.out.println();
        processEmployee(manager);
        System.out.println();
        processEmployee(developer);
    }
}