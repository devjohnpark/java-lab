package thread.multithread;

//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 300; i++) {
//            System.out.printf("%s", new String("x"));
//        }
//        System.out.println("소요시간x:" + (System.currentTimeMillis() - MultiThreadTest.startTime));
//    }
//}
//
//public class MultiThreadTest {
//    static long startTime = 0;
//
//    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        t1.start();
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 300; i++) {
//            System.out.printf("%s", new String("o"));
//        }
//        System.out.println("소요시간o:" + (System.currentTimeMillis() - startTime));
//    }
//}


import java.util.concurrent.atomic.AtomicBoolean;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "x");
        }
        System.out.println("\n소요시간x:" + (System.currentTimeMillis() - MultiThreadTest.startTime));
    }
}

class MonitorThread extends Thread {
    private final Thread t1;
    private final Thread mainThread;
    private final AtomicBoolean running = new AtomicBoolean(true);

    public MonitorThread(Thread t1, Thread mainThread) {
        this.t1 = t1;
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        while (running.get()) {
            System.out.println("MyThread 상태: " + t1.getState());
            System.out.println("MainThread 상태: " + mainThread.getState());
            try {
                Thread.sleep(1); // 1ms마다 상태 체크
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopMonitoring() {
        running.set(false);
    }
}

public class MultiThreadTest {
    static long startTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread();
        MonitorThread monitorThread = new MonitorThread(t1, Thread.currentThread());

        startTime = System.currentTimeMillis();
        t1.start();
        monitorThread.start();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "o");
        }
        System.out.println("\n소요시간o:" + (System.currentTimeMillis() - startTime));

        t1.join();
        monitorThread.stopMonitoring();
        monitorThread.join();
    }
}
