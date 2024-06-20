package objectoriented.method;

public class MethodCallByValueTest {

    void changeReferenceTypeStr(String str) {
        // strd은 원본 주소를 참조
        // "Halo"을 가진 새로운 객체를 생성하고 str 매개변수가 해당 객체를 참조하도록 변경된다. (String 타입 문자열 변경 불가)
        // 그리하여 원본값 변경 불가능
        str = "Halo";
    }


    void changeReferenceTypeChArr(char[] arr) {
        arr[0] = 'H'; // arr은 원본 주소를 참조하므로 원본 값 변경 가능
    }

    void changeValueTypeInt(int num) {
        num = 10; // num은 값만 전달받아 원본 값 변경 불가능
    }

    public static void main(String[] args) {
        MethodCallByValueTest m = new MethodCallByValueTest();

        String str = new String("Hello World");
        System.out.println(str);
        m.changeReferenceTypeStr(str);
        System.out.println(str);

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(arr);
        m.changeReferenceTypeChArr(arr);
        System.out.println(arr);

        int num = 1;
        System.out.println(num);
        m.changeValueTypeInt(num);
        System.out.println(num);

    }
}