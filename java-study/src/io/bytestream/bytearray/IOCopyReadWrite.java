package io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOCopyReadWrite {
    public static void main(String[] args) {
        byte[] inSrc = { 0, 1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] tmp = new byte[4];

        ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.out.println("Input Source: " + Arrays.toString(inSrc));
        try {
            while (in.available() > 0) { // blocking 없이 읽어올수 있는 바이트의 수 반환)
                int len = in.read(tmp); // InputStream의 메서드
                out.write(tmp, 0, len); // OutputStream의 메서드
            }

        } catch (IOException e) {

        }

        outSrc = out.toByteArray(); // 바이트 배열으로 변환
        printArray(tmp, outSrc); // tmp, outSrc 출력
    }

    static void printArray(byte[] tmp, byte[] outSrc) {
        System.out.println("tmp: " + Arrays.toString(tmp));
        System.out.println("outSrc: " + Arrays.toString(outSrc));
    }
}
