package bytecode;

public class Main {
    public static void main(String[] args) {
        AddExample example = new AddExample();
        int result = example.add(5, 32768); // add 메소드 호출
        System.out.println("Add: " + result); // 결과 출력
    }
}
