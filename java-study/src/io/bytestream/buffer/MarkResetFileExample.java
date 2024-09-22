package io.bytestream.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MarkResetFileExample {
    private static final String ROOT_DIR = "io-test/";
    private static final String filePath = "hello.txt";

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(ROOT_DIR + filePath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            // markSupported()로 mark/reset 기능 지원 여부 확인
            if (bufferedInputStream.markSupported()) {
                System.out.println("mark() and reset() are supported.");

                // 첫 번째로 데이터를 읽음
                int firstByte = bufferedInputStream.read();
                System.out.println("First byte: " + (char) firstByte);

                // mark() 설정 (5바이트까지 유효)
                bufferedInputStream.mark(5);

                // 다음 몇 바이트를 읽음
                int secondByte = bufferedInputStream.read();
                System.out.println("Second byte: " + (char) secondByte);

                int thirdByte = bufferedInputStream.read();
                System.out.println("Third byte: " + (char) thirdByte);

                // reset()을 호출하여 mark() 이후 위치로 되돌림
                bufferedInputStream.reset();

                // 다시 mark() 이후 데이터를 읽음 (위에서 읽은 두 번째 바이트가 나옴)
                int resetByte = bufferedInputStream.read();
                System.out.println("After reset, second byte: " + (char) resetByte);
            } else {
                System.out.println("mark() and reset() are NOT supported.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
