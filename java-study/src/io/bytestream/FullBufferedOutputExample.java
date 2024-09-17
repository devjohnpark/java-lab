package io.bytestream;

import java.io.*;

public class FullBufferedOutputExample {
    private static final String ROOT_DIR = "io-test/";
    private static final String filePath = "full_buffer_output.txt";

    public static void main(String[] args) {

        // 작은 버퍼를 가지는 FileOutputStream을 생성
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 10)) { // 버퍼 크기 10바이트

            String data = "Hello, this is an example of full buffered output.";
            byte[] bytes = data.getBytes();

            // 데이터를 버퍼에 쓰기
            for (byte b : bytes) {
                bufferedOutputStream.write(b);
                // 버퍼 크기 10바이트이므로, 10바이트 쓰면 디스크에 기록
            }

            readFileWithBufferedInputStream(filePath); // [Content] Hello, this is an example of full buffer

            // 이 시점까지 버퍼에 10바이트가 가득 차면 자동으로 디스크에 기록됨
            // 'flush()'를 호출하면 버퍼에 남아있는 데이터를 강제로 디스크에 기록함
            bufferedOutputStream.flush(); // 강제로 버퍼의 데이터 디스크에 기록

            readFileWithBufferedInputStream(filePath); // [Content] Hello, this is an example of full buffered output.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithBufferedInputStream(String filePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            StringBuilder content = new StringBuilder();
            while ((bytesRead = bis.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }
            if (content.length() > 0) {
                System.out.println("[Content] " + content.toString());
            } else {
                System.out.println("[No content]");
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + filePath + ": " + e.getMessage());
        }
    }
}
