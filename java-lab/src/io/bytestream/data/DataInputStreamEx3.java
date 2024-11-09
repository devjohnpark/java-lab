package io.bytestream.data;

import java.io.*;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("io-Test/sample.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(-10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            dos.writeUTF("Hello World");
            dos.writeBoolean(false);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("io-Test/sample.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}