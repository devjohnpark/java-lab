package loop;

public class Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Java의 향상된 for문은 배열을 요소 값을 변수(wheel)에 저장한다. 따라서 배열의 요소를 직접 수정 불가능
        for (int tmp: arr) {
            System.out.println(tmp);
        }
    }
}
