package io.characterstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("io-Test/input_stream_reader.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            System.out.println("OS default encoding: " + isr.getEncoding() + "\n");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
        }
    }
}
