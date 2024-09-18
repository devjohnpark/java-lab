package io.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx1 {
    private static final String ROOT_DIR = "io-test/";
    private static final String FILE_NAME = "123456789.txt";

    static public String getFileName() {
        return ROOT_DIR + FILE_NAME;
    }

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(getFileName());
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            int data;

            // 내부 버퍼에서 한 바이트 단위로 data 변수에 데이터 반환
            while ((data = bis.read()) != -1) {
                System.out.println((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
