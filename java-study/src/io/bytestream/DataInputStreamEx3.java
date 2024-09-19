package io.bytestream;

import java.io.*;
import java.util.Arrays;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("io-test/sample.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(-10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            dos.writeUTF("Hello World");
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("io-test/sample.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}