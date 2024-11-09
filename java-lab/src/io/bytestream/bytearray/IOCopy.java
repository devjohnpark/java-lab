package io.bytestream.bytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOCopy {
    public static void main(String[] args) {
        byte[] inSrc = { 0, 1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;

        ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        int data = 0;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        outSrc = out.toByteArray();
        System.out.println("Input Source: " + Arrays.toString(inSrc));
        System.out.println("Output Source: " + Arrays.toString(outSrc));
    }
}
