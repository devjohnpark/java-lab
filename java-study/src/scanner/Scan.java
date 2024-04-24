package scanner;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        // 추후 Scanner 클래스 파보기
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // nextLine() 메서드 호출시에 입력 대기 상태에 있다가, Enter 입력시에 문자열 변환 ('scanner 인스턴스가 \n 제거 후 문자열 반환')
        int num = Integer.parseInt(str); // 숫자 형태의 문자열만 int 형으로 변환
        /*
        "20" -> 20
        "20" 이란, 문자열은 문자를 배열로 나열한 것이며, 문자는 0과 자연수로 맵핑된 유니코드이다.
        따라서 문자의 차로 숫자를 구할수 있다.
        문자 배열을 마지막 인덱스 부터 빼내어, 자리수 별로 값을 곱하면 숫자가 나온다.
        위의
        20 = 1 * ('0' - '0') + 10 * ('2' - '0')
        Interger.parseInt 메소드는 위의 로직 처럼 구현되어 있을 것이다.
         */
        System.out.println(str);
        System.out.printf("num=%d\n", num);
        System.out.println(str);
    }
}
