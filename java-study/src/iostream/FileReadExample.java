package iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "hello.txt";

        // FileInputStream을 사용하여 파일을 읽기 위한 스트림을 생성
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             // BufferedInputStream을 사용하여 성능 향상
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            int byteData;
            // 파일의 끝까지 바이트 단위로 읽기
            while ((byteData = bufferedInputStream.read()) != -1) {
                // 읽은 바이트를 출력 (문자 변환 후 출력)
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            // 예외 처리
            System.err.println("File reading failed: " + e.getMessage());
        }
    }
}
