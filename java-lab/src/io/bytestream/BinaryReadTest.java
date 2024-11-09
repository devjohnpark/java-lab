package io.bytestream;

import java.io.*;
import java.util.Arrays;

public class BinaryReadTest {
    public static void main(String[] args) throws IOException {
        // 바이너리 데이터를 담은 예제 파일
        String filePath = "io-Test/binaryData.bin"; // 저장할 파일 경로
        byte[] binaryData = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05 };

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(binaryData); // 바이너리 데이터 파일에 쓰기
            System.out.println("바이너리 데이터 파일이 생성되었습니다: " + filePath);
        }

        byte[] bodyIn;
        byte[] bodyBr;
        // InputStream을 통해 바이트 데이터 읽기
        try (InputStream inputStream = new FileInputStream(filePath)) {
            byte[] body = new byte[binaryData.length];
            inputStream.read(body, 0, binaryData.length);
            bodyIn = body;
        }

        // BufferedReader를 통해 문자 데이터로 읽기
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            char[] body = new char[binaryData.length];
            bufferedReader.read(body, 0, binaryData.length);
            bodyBr = String.copyValueOf(body).getBytes();
        }

        // bodyIn과 bodyBr의 값을 출력
        System.out.println("InputStream으로 읽은 바이트 데이터 (bodyIn): " + Arrays.toString(bodyIn));
        System.out.println("BufferedReader로 읽은 바이트 데이터 (bodyBr): " + Arrays.toString(bodyBr));

        if (Arrays.equals(bodyIn, bodyBr)) {
            System.out.println("바이너리 데이터와 문자 데이터가 일치합니다.");
        } else {
            System.out.println("바이너리 데이터와 문자 데이터가 일치하지 않습니다.");
        }
    }
}
