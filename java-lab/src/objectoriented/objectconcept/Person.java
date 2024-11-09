package objectoriented.objectconcept;

// Person 클래스 (이름과 컴퓨터를 소유)
public class Person {
    private String name;
    private Computer computer; // Person이 가지는 컴퓨터 객체

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    // 컴퓨터 설정 메서드
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    // 계산식을 평가하는 메서드
    public int getCalculatedValue(int operand1, int operand2, char operator) {
        return computer.calculate(operand1, operand2, operator);
    }
}