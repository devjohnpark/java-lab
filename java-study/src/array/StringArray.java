package array;

public class StringArray {
    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "park";
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

        // String 클래스는 char 배열에 기능(메소드)를 추가한것이다.
        // C언어 에서는 문자열을 char 배열로 다룬다.
        // 객체지향언어인 java에서는 char 배열과 그에 관련된 메소드들을 묶어서 클래스에 정의한다.

        // String 객체는 쓰기가 불가능하다. 왜냐하면 초기값이 저장될때 해당 메모리 공간만큼 할당되기 때문에
        String str = "junseo";
        System.out.println(str.hashCode());

        str = str + "park";

        System.out.println(str.hashCode());
    }
}
