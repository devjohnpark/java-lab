package io.bytestream;

import array.Array;

import java.io.*;
import java.util.Arrays;

public class DataInputStreamEx2 {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;
        byte[] result = null;
        try {
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);

            dos.writeInt(-4);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            result = bos.toByteArray();

            String[] hex = new String[result.length];

            for (int i = 0; i < result.length; i++) {
                if (result[i] < 0) {
//                    System.out.println(String.format("%02x", result[i]));
                    hex[i] = String.format("%02x", result[i]+256);
                } else {
//                    System.out.println("Postive value: ");
                    hex[i] = String.format("%02x", result[i]);
                }
            }

            System.out.println("10진수: " + Arrays.toString(result));
            System.out.println("16진수: " + Arrays.toString(hex));

            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//10진수: [-1, -1, -1, -4, 65, -96, 0, 0, 1]
//16진수: [ff, ff, ff, fc, 41, a0, 00, 00, 01]
//10진수: [-1, -1, -1, -4, 65, -96, 0, 0, 1]
//16진수: [ff, ff, ff, fc, 41, a0, 00, 00, 01]