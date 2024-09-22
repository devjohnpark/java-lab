package io.bytestream.buffer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FlushExample {
    private static final String ROOT_DIR = "io-test/";
    private static final String[] FILE_NAMES = {"unbuffered.txt", "buffered.txt", "buffered_writer.txt"};

    static public String getFileName(int i) {
        return ROOT_DIR + FILE_NAMES[i];
    }

    public static void main(String[] args) {
        initializeFiles();

        // 버퍼가 없는 출력 스트림 예제
        try (OutputStream os = new FileOutputStream(getFileName(0))) {
            System.out.println("Writing to unbuffered stream");
            os.write("Hello, World!".getBytes()); // write() 메서드 호출하면 즉시 데이터가 파일에 쓰인다.
            System.out.println("Before flush");
            readFileWithBufferedInputStream(getFileName(0));
            os.flush(); // 이 flush()는 실제로 아무 효과가 없다.
            System.out.println("After flush");
            readFileWithBufferedInputStream(getFileName(0));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 버퍼가 있는 출력 스트림 예제
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(getFileName(1)))) {
            System.out.println("Writing to buffered stream");
            bos.write("Hello, World!".getBytes()); // 데이터를 버퍼(바이트 배열)에 씀
            System.out.println("Before flush");
            readFileWithBufferedInputStream(getFileName(1));
            System.out.println("After flush");
            bos.flush(); // 이 flush()는 버퍼의 모든 데이터를 파일에 쓴다.
            readFileWithBufferedInputStream(getFileName(1));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 버퍼가 있는 Writer 예제
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(2)))) {
            System.out.println("Writing to BufferedWriter");
            writer.write("Hello, World!");
            System.out.println("Before flush");
            readFileWithBufferedInputStream(getFileName(2));
            writer.flush();
            System.out.println("After flush");
            readFileWithBufferedInputStream(getFileName(2));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void initializeFiles() {
        for (int i = 0; i < FILE_NAMES.length; i++) {
            String fileName = getFileName(i);
            try {
                Files.deleteIfExists(Paths.get(fileName));
                System.out.println("Deleted existing file: " + fileName);
            } catch (IOException e) {
                System.err.println("Error deleting file " + fileName + ": " + e.getMessage());
            }
        }
        System.out.println();
    }

    private static void readFileWithBufferedInputStream(String filePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            StringBuilder content = new StringBuilder();
            while ((bytesRead = bis.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }
            if (content.length() > 0) {
                System.out.println("[Content] " + content.toString());
            } else {
                System.out.println("[No content]");
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + filePath + ": " + e.getMessage());
        }
    }
}