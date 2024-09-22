package io.characterstream;

import java.io.*;

public class BufferedReaderWriterEx {
    public static void main(String[] args) {
        // 파일에 데이터 쓰기
        String fileName = "io-test/buffered_rw_test.txt";
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is a test.");
            bw.newLine();
            bw.write("BufferedReader and BufferedWriter example.");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일에서 데이터 읽기
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
