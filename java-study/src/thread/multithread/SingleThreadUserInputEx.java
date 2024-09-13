package thread.multithread;


import javax.swing.*;

public class SingleThreadUserInputEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a sentence");
        System.out.println("You entered: " + input);

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
