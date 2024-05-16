package objectoriented;

public class VariablesMethods {
    static int classVariable = 10;
    int instanceVariable = 20;

    void instanceMethod() {
//        static int si; // error
        int localVariable = 100;

        if (true) {
            int localVariableInBlock = 0; // int localVariable = 0; (x)
            localVariableInBlock += localVariable;
        }

    }

    void otherInstanceMethod() {
        instanceMethod(); // 인스턴스 메서드끼리는 서로 호출이 가능
    }

    static void classMethod() {
        classVariable = 100;
//        instanceMethod(); // instance method 호출 불가
//        instanceVariable = 30;  // instance variable 접근 불가
    }

    static void otherClassMethod() {
        classMethod();
    }

    char[] hello() {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        return arr;
    }

    public static void main(String[] args) {
        VariablesMethods.classMethod(); // 인스턴스 생성 없이 실행 가능
        System.out.println(classVariable);
        VariablesMethods variablesMethods = new VariablesMethods();

        char[] arr = variablesMethods.hello();

        System.out.println(arr);
    }
}
