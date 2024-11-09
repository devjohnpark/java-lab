package objectoriented.method;

public class VariablesMethods {
    static int classVariable = 10;
    int instanceVariable = 20;
    static int otherClassVariable;
    int otherInstanceVariable;

    void instanceMethod() {
//        static int si; // error
        int localVariable = 100;
        if (true) {
//            java: variable localVariable is already defined in method instanceMethod()
//            int localVariable = 0; // Scope error -> 중괄호 있더라도 같은 스택 프레임 내의 동일 변수명 구별 불가
            int localVariableInBlock = 0;
            localVariableInBlock += localVariable;
        }
        instanceVariable += localVariable;
    }

    void otherInstanceMethod() {
        instanceMethod(); // 인스턴스 메서드끼리는 서로 호출이 가능
    }

    static void classMethod() {
        classVariable = 100;
//        instanceMethod(); // instance method 호출 불가
//        instanceVariable = 30;  // instance variable 접근 불가
    }

    static int otherClassMethod() {
        classMethod();
        int localVariable = 300;
        return localVariable;
    }

    char[] hello() {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        return arr;
    }

    public static void main(String[] args) {
        VariablesMethods.classMethod(); // 인스턴스 생성 없이 실행 가능
        VariablesMethods variablesMethods = new VariablesMethods();
        variablesMethods.instanceMethod();
        System.out.println(variablesMethods.instanceVariable);
        char[] arr = variablesMethods.hello();

        System.out.println(arr);
        int num = VariablesMethods.otherClassMethod();
        System.out.println(num);
    }
}
