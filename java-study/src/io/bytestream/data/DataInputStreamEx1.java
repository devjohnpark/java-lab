package io.bytestream;

import java.io.*;

public class DataInputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("io-test/sample.dat");
            dos = new DataOutputStream(fos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            dos.writeUTF("Hello World");
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("io-test/sample.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);

            byte[] buffer = new byte[1024];
            int bytesRead;

            // 내부 버퍼에서 1024 바이트 단위로 바이트 배열 buffer로 한번에 복사
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
