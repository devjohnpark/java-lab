package array;

public class StringArray {
    public static void main(String[] args) {
        String[] name = new String[3];
        System.out.println(name[0]); // 참조형 변수라 null로 자동 초기화

        // name[i] 각 배열 요소는 참조형 변수이며, String 객체의 주소를 저장하여 해당 객체를 가리킨다.
        name[0] = "steve"; // name[0] = new String("steve")과 동일 (new 연산자의 생략은 표현의 허용이다.)
        name[1] = "paul";
        name[2] = "jobs";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // String 배열의 선언과 생성 초기화 (위의 name과 동일한 문자열 할당)
        String[] name2 = new String[] {"steve", "paul", "jobs"};

        for (int i = 0; i < name2.length; i++) {
            System.out.println(name2[i]);
        }

        String[] name3 = { "park", "", "seo"};
        for (int i = 0; i < name3.length; i++) {
            System.out.println(name3[i]);
        }

        // String 객체는 char 배열과 동일한 뜻이지만, String 객체는 쓰기가 불가능하다.
        // 위의 배열의 복사에서 설명한 것처럼 배열은 한번 생성하면 그 길이를 변경할 수 없지만, String 객체는 문자(각 요소 값) 변경도 불가능하다.
        String str = "steve";
        String tmp = str; // 참조 변수인, str 값 복사

        str = str + "jobs"; // 기존의 str의 문자열이 변경되는 것이 아니라, 새로운 문자열이 할당된다.

        // String 배열 선언과 생성 초가화 (위의 name과 동일한 문자열 할당)
        if (tmp == str) {
            System.out.println("str과 tmp는 같은 객체를 가리킴");
        } else {
            System.out.println("str과 tmp는 다른 객체를 가리킴");  // str과 tmp는 다른 객체를 가리킴
        }

        StringBuffer sb = new StringBuffer();

    }
}
