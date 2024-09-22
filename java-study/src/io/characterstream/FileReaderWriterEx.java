package io.characterstream;

import java.io.*;

public class FileReaderWriterEx {
    public static void main(String[] args) {
        String fimeName = "io-test/fileStream.txt";
        String outputData = "Hello는 안녕";
        try {
//            FileOutputStream fos = new FileOutputStream(fimeName);
//            byte[] buffer = outputData.getBytes();
//            for (byte b : buffer) {
//                fos.write(b);
//            }
//            fos.close();

            FileWriter fw = new FileWriter(fimeName);

            char [] bytes = outputData.toCharArray();
            for (char b : bytes) {
                fw.write(b);
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(fimeName);
            FileReader fr = new FileReader(fimeName);

            int data = 0;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
