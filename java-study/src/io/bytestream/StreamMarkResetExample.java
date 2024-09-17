package io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class StreamMarkResetExample {
    public static void main(String[] args) {
        // 테스트할 데이터
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        byte[] byteData = data.getBytes();

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(byteData)) {
            // markSupported() 메서드로 mark와 reset 기능 지원 여부 확인
            if (inputStream.markSupported()) {
                System.out.println("Mark and reset are supported");

                // 처음 3개의 바이트 읽기
                for (int i = 0; i < 2; i++) {
                    System.out.print((char) inputStream.read()); // ABC
                }
                System.out.println(); // 새 줄

                // 현재 위치에 마크 설정 (읽기 제한 5바이트)
                inputStream.mark(5); // C

                // 다음 5개의 바이트 읽기
                for (int i = 0; i < 10; i++) {
                    System.out.print((char) inputStream.read()); // CDEFGHIJKL
                }
                System.out.println();

                // 마크한 위치로 스트림 되돌리기
                inputStream.reset(); // C

                // 마크 위치부터 다시 읽기
                int c;
                while ((c = inputStream.read()) != -1) {
                    System.out.print((char) c); // CDEFGHIJKLMNOPQRSTUVWXYZ
                }
            } else {
                System.out.println("Mark and reset are not supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}