package objectoriented.objectconcept;

// Refrigerator 클래스
public class Computer {
    private String model;

    // 생성자
    public Computer(String model) {
        this.model = model;
    }

    // 계산 메소드
    public int calculate(int operand1, int operand2, char operator) {
        int result = 0;
        switch(operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
        return result;
    }
}

