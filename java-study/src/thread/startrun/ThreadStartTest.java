package thread.startrun;


public class ThreadStartTest {
    public static void main(String[] args) {
        ThreadThrow thread = new ThreadThrow();
        thread.start();
    }
}
