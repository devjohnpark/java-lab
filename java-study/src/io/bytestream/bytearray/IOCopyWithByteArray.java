package io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOCopyWithByteArray {
    public static void main(String[] args) {
        byte[] inSrc = { 0, 1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] tmp = new byte[inSrc.length];

        ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        in.read(tmp, 0, inSrc.length); // in에서 최대 inSrc.length개의 데이터를 읽어서 tmp 배열의 인덱스 0부터 모두 저장
        out.write(tmp, 5, 5); // tmp 배열의 인덱스 5부터 5개의 데이터를 out에다가 write한다.

        outSrc = out.toByteArray();
        System.out.println("Input Source: " + Arrays.toString(inSrc));
        System.out.println("tmp: " + Arrays.toString(tmp));
        System.out.println("Output Source: " + Arrays.toString(outSrc));
    }
}
