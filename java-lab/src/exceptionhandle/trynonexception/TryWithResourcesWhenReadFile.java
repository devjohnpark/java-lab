package exceptionhandle.trynonexception;

import java.io.FileReader;
import java.io.IOException;


class TryWithResourcesWhenReadFile {
    public static void main(String[] args) {
        try {
            String fileContent = readFile(args[0]);
            String transformedContent = transformContentToUppercase(fileContent);
            System.out.println(transformedContent);
        } catch (IOException e) {
            System.out.println("The file name is invalid or reading failed due to an error.");
        }
    }

    // 파일을 읽고 내용을 반환하는 메서드 (try-with-resources 사용)
    public static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();

        // try-with-resources 구문을 사용하여 FileReader 자원을 자동으로 해제
        try (FileReader reader = new FileReader(fileName)) { // FileNotFoundException이 발생할 수 있음
            int character;
            while ((character = reader.read()) != -1) { // IOException이 발생할 수 있음
                content.append((char) character);
            }
        }
        return content.toString();
    }


    // 파일 내용을 대문자로 변환하는 메서드
    public static String transformContentToUppercase(String content) {
        return content.toUpperCase();
    }
}
