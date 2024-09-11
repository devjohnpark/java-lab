package thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1(); // Thread의 자손 클래스의 인스턴스 생성

        Runnable r = new MyThread2(); // Runnable을 구현한 클래스의 인스턴스를 생성
        Thread thread2 = new Thread(r);


        // "Thread-0"과 "Thread-1"이 무작위로 번갈아가며 각각 10번씩 출력된다.
        // 멀티스레딩 환경에서 두 스레드는 CPU 스케줄링에 따라 번갈아가며 실행된다.
        thread1.start();
        thread2.start();
    }
}
