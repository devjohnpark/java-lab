package array;

import java.util.Arrays;

// 배열은 같은 타입의 여러 변수들을 하나로 묶는 것이며, 연속적으로 저장한다.
public class Array {
    public static void arraySort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다룬다.
        // int[] arr; -> int 타입 배열을 다루기 위함 참조 변수 선언;
        // arr = new int[5]; -> new 연산자를 통하여 배열 생성 (요구되는 메모리 공간 만큼 확보)
        // arr은 배열을 가리키기 위한 참조 변수이다.
        // 생성된 배열은 연속적인 메모리 공간에 저장되어 있다.
        int[] arr = new int[5]; // 0으로 최기화
        System.out.println(arr); // [I@2a84aee7: 타입@주소 (I는 1차원 int 배열, @ 뒤부터는 16진수로 표현된 배열의 주소이며 실제 주소가 아닌 내부 주소이다.)
        /*
        자바에서의 내부 주소는 보통 객체에 대한 고유 식별자이며, 이는 객체의 메모리 상의 위치를 나타내는 것이 아니라
        JVM이 객체를 추적하고 관리하기 위해 사용하는 값이다.
        이 내부 주소는 일반적으로 해시 코드나 다른 식별자로 표현되며, 실제 메모리 주소와는 별개이다.
        자바에서의 내부 주소는 실제 메모리 주소와 다른 개념이며, 메모리 관리 및 가상화를 위해 사용된다.
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\n", arr[i]);
        }

        // 길이가 0인 배열 생성 (C언어와 달리 java는 길이가 0인 배열도 생성 가능)
        int[] x = new int[0];
        int[] x1 = new int[]{};
        int[] x2 = {};

        System.out.printf("%d %d %d\n", x.length, x1.length, x2.length);

//        Index 0 out of bounds for length 0
//        x[0] = 1;
//        x1[0] = 1;
//        x2[0] = 1;


//        System.out.printf("%d, %d, %d\n", x[0], x1[0], x2[0]);

        // JVM이 배열 길이를 관리하고, 배열 크기는 정적으로 고정되어 크기 변경이 불가하다. 그러므로 베열의 length는 상수이며, 변경 못한다.
        // 따라서 배열의 크기를 늘리고 싶은 경우, 더 큰 길이의 새로운 배열을 생성하여 복사해줘야한다.
        System.out.printf("arr length: %d\n", arr.length);

        // for loop -> array copy
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copy = new int[original.length * 2];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        original = copy; // 배열 주소 변경하여, 새로운 배열을 가리켜 기존 original의 배열 크기에서 2배 증가됨

        // Arrays.toString(): 배열의 모든 요소를 출력
        System.out.printf("for loop -> array copy %s %d\n", Arrays.toString(original), original.length);

        // System.arraycopy() -> array copy
        int[] original2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copy2 = new int[original2.length*2];

        // for문은 배열의 요소 값에 하나 하나 접근하지만, System.arraycopy는 한번에 복사하여 for 문보다 더 빠르고 간편하게 복사
        // 배열은 연속적으로 저장된 값이기 때문에 범위를 알고 있어, System.arraycopy는 지정된 범위의 값을 한번에 복사하여 처리한다.
        System.arraycopy(original2, 0, copy2, 0, original2.length);
        System.out.printf("System.arraycopy() -> array copy %s %d\n", Arrays.toString(copy2), copy2.length);

        // Arrays.copyOfRange() -> array copy
        int[] original3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copy3 = new int[original3.length*2];
        copy3 = Arrays.copyOfRange(original3, 0, original3.length*2);
        System.out.printf("Arrays.copyOfRange() -> array copy %s %d\n", Arrays.toString(copy3), copy3.length);
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr2));



        // String 타입의 변수는 char 배열과 같은 뜻이며, 문자를 나열한 것이다.
        // 따라서 char 타입은 다른 타입의 배열과 다르게, 참조 변수로 배열 모든 값 한번에 출력 가능
        char[] arr5 = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(arr5);


        // String만 대문자 인데, 이는 class이다. 허나 char 배열과 같은 뜻이며, 문자를 나열한 것이다.
        // C언어는 char 타입 배열으로만 문자열을 표현하지만, 문자열은 개발할때 아주 빈번히 쓰인다.
        // 객체지향언어인 자바에서는 char 배열에 그에 관련된 메소드(기능)들을 묶어서 추가하여 String 클래스로 정의하였다.
        String str = "hello";
        char ch = str.charAt(0);
        System.out.printf("%c\n", ch);

        String temp = str.substring(2, 4);
        System.out.println(temp);

        // char -> String
        char[] chArr = { 'A', 'B', 'C', 'D', 'E', 'F' };
        String str2 = new String(chArr); // chArr 모든 배열값 복사한 문자열 저장
        System.out.println(str2);

        // String -> char
        char[] chArr2 = str2.toCharArray();
        System.out.println(chArr2);
    }
}
