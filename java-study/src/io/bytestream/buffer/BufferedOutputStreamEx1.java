package io.bytestream;

import java.io.*;

public class BufferedOutputStreamEx1 {
    private static final String ROOT_DIR = "io-test/";
    private static final String FILE_NAME = "123456789.txt";

    static public String getFileName() {
        return ROOT_DIR + FILE_NAME;
    }

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(getFileName());
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }

            bos.close();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(getFileName()), 10);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
