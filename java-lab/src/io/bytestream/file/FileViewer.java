package io.bytestream.file;

import java.io.*;

public class FileViewer {
    private static final String ROOT_DIR = "io-Test/";
    private static final String FILE_DIR = "hello.txt";

    static public String getFileName() {
        return ROOT_DIR + FILE_DIR;
    }

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0])) {
            int data = 0;
            while ((data = fis.read()) != -1) {
                char c = (char) data;
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
