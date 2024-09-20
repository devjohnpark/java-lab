package io.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx2 {
    private static final String ROOT_DIR = "io-test/";
    private static final String FILE_NAME = "123456789.txt";

    static public String getFileName() {
        return ROOT_DIR + FILE_NAME;
    }

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(getFileName());
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // 내부 버퍼에서 1024 바이트 단위로 바이트 배열 buffer로 한번에 복사
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}