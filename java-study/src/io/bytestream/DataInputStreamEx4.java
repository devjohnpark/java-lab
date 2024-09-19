package io.bytestream;

import java.io.*;

public class DataInputStreamEx4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("io-test/score.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.writeInt(90);
            dos.writeInt(80);
            dos.writeInt(70);
            dos.writeInt(60);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        int score = 0;

        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("io-test/score.dat");
            dis = new DataInputStream(fis);
            while (true) {
                System.out.println(score);
                score += dis.readInt();
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println("Total score is: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}