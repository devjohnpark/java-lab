package objectoriented.initblock;

public class InitBlock {

    // 클래스 변수 (정적 변수)
    private static int staticVariable = 1;

    // 인스턴스 변수
    private int instanceVariable = 1;

    // 정적 초기화 블록
    static {
        try {
            printStaticVariable("Explicit Initialization");
            staticVariable = initializeStaticVariable();
            printStaticVariable("Class Initialization Block");
        } catch (Exception e) {
            e.printStackTrace();
            staticVariable = -1; // 초기화 실패 시 기본값 설정
            System.out.println("Exception during static initialization.");
        }
    }

    // 인스턴스 초기화 블록
    {
        printInstanceVariables("Explicit Initialization");
        instanceVariable = 10;
        printInstanceVariables("Instance Initialization Block");
    }

    // 기본 생성자
    public InitBlock() {
        instanceVariable = 100;
        printInstanceVariables("Constructor Initialization");
    }

    // 시점별 클래스 변수 출력 메서드
    public static void printStaticVariable(String pointOfView) {
        System.out.println(pointOfView + " Static Variable: " + staticVariable);
    }

    // 시점별 인스턴스 변수 출력 메서드
    public void printInstanceVariables(String pointOfView) {
        System.out.println(pointOfView + " Instance Variable: " + instanceVariable);
    }

    // 정적 멤버 변수 초기화를 위한 메소드  
    private static int initializeStaticVariable() throws Exception {
        // 특정 조건에 따라 예외를 발생시킴  
        if (Math.random() < 0.5) {
            throw new Exception("정적 초기화 실패");
        }
        return 100; // 정상 초기화 값  
    }


    public static void main(String[] args) {
//        // 정적 변수 출력
//        InitBlock.printStaticVariable();

        // 객체 생성
        InitBlock initBlock = new InitBlock();
//        // 인스턴스 변수 출력
//        initBlock.printInstanceVariables();
    }
}
