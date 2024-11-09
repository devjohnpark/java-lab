package exceptionhandle.trynonexception;

import java.io.FileReader;
import java.io.IOException;

class TryNonExceptionHandleWhenReadFile {
    public static void main(String[] args) {
        try {
            String fileContent = readFile(args[0]);
            String transformedContent = transformContentToUppercase(fileContent);
            System.out.println(transformedContent);
        } catch (IOException e) {
            System.out.println("The file name is invalid or reading failed due to an error.");
        }
    }

    // 파일을 읽고 내용을 반환하는 메서드 (예외를 던질 수 있음)
    public static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        FileReader reader = null;
        try {
            reader = new FileReader(fileName); // FileNotFoundException이 발생할 수 있음
            int character;
            while ((character = reader.read()) != -1) { // IOException이 발생할 수 있음
                content.append((char) character);
            }
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // IOException이 발생할 수 있음
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content.toString();
    }


    // 파일 내용을 대문자로 변환하는 메서드
    public static String transformContentToUppercase(String content) {
        return content.toUpperCase();
    }
}
