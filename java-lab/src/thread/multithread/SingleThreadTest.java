package thread.multithread;

public class SingleThreadTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("o"));
        }
        System.out.println("소요시간o:" + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("x"));
        }
        System.out.println("소요시간x:" + (System.currentTimeMillis() - startTime));
    }
}
