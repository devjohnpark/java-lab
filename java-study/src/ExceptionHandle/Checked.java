package ExceptionHandle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
    public static void main(String[] args) {
        // 체크 예외 처리 예제
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception occurred.");
        }
    }
}
