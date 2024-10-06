package io.characterstream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) {
        String str = "abcde";
        StringReader sr = new StringReader(str);
        StringWriter sw = new StringWriter();
        int data = 0;
        try {
            while ((data = sr.read()) != -1) {
                sw.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Input String: " + str);
        System.out.println("Output String: " + sw.toString());
        System.out.println("Output String: " + sw.getBuffer().toString());
    }
}
