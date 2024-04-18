package variable;
/*
자바에서는 클래스들을 패키지로 구성하여 관리한다.
패키지는 클래스들을 논리적으로 그룹화하고 네임스페이스를 제공하는 방법이다.
이렇게 패키징하면, Main.java 함수를 실행시켜도 패키지에 존재하는 모든 클래스를 실행시킨다.
 */

public class Var1 {
    public static void main(String[] args) {
        /*
        int num: local variable (method 내에 존재하는 variable)
        변수 선언시, memory allocation과 naming이 된다.
         */
        int num;
        System.out.println(10);

        /*
        System.out.println(num); 실행시 에러 발생
        java: variable num might not have been initialized
        메모리 해제가 안된 메모리 공간을 할당 받을 수 있어, 변수 선언 후 초기화하지 않을시에 예상치 못한 값이 저장되어 있을수 있다.
        자바에서는 이와 같은 상황을 방지하기 위해, 초기화 하지 않은 변수를 읽을시에 위와 같은 에러가 발생되도록 하였다.
        위의 에러는 컴파일시에 발생하여 class 파일로 변환되지 않는다.
         */
//        System.out.println(num);
    }
}
