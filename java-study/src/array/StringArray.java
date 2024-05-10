package array;

public class StringArray {
    public static void main(String[] args) {
        String[] name = new String[3];
        System.out.println(name[0]); // null로 자동 초기화

        // name[i] 각 배열 요소는 참조형 변수이며, String 객체의 주소를 저장하여 해당 객체를 가리킨다.
        name[0] = "park"; // name[0] = new String("park")과 동일 (new 연산자의 생략은 표현의 허용이다.)
        name[1] = "jun";
        name[2] = "seo";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        String[] name2 = new String[] {"park", "jun", "seo"};
        String[] name3 = { "park", "", "seo"};
        for (int i = 0; i < name2.length; i++) {
            System.out.println(name2[i]);
        }

        for (int i = 0; i < name3.length; i++) {
            System.out.println(name3[i]);
        }

        // String 객체는 쓰기가 불가능하다. 왜냐하면 초기값이 저장될때 해당 메모리 공간만큼 할당되기 때문에
        String str = "junseo";
        System.out.println(str.hashCode());

        str = str + "park";

        System.out.println(str.hashCode());
    }
}
