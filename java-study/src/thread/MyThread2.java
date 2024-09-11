package thread;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // Thread.currentThread(): 현재 실행중인 스레드 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
