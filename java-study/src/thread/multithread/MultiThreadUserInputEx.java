package thread.multithread;

import javax.swing.*;

class ThreadEx extends Thread{
    public void run() {
        for (int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadUserInputEx {
    public static void main(String[] args) {
        ThreadEx thread = new ThreadEx();
        thread.start();

        String input = JOptionPane.showInputDialog("Enter a sentence");
        System.out.println("You entered: " + input);
    }
}
