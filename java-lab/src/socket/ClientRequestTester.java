package socket;

import java.io.*;
import java.net.*;

public class ClientRequestTester {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 첫 번째 요청 보내기
        try (Socket socket = new Socket("localhost", 8080);
             OutputStream outputStream = socket.getOutputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {


            // 첫 번째 요청 보내기
            String firstRequest = "GET /1 HTTP/1.1\r\nHost: localhost1\r\n\r\n";
            outputStream.write(firstRequest.getBytes());
            outputStream.flush();

            // 첫 번째 응답 받기
            String line;
            System.out.println("Response after first request: ");
            System.out.println("Header");
            while (!(line = reader.readLine()).isEmpty()) {
                System.out.println(line);
            }
            System.out.println("Body");
            // 정확히 content-length를 맞춰야, 다음 요청 메세지를 읽을때 데이터가 안남는다.
            char[] buffer1 = new char[20]; // 20문자를 저장할 배열
            int bytesRead = reader.read(buffer1, 0, 20); // 최대 16문자 읽기

            // 읽은 데이터 출력
            if (bytesRead != -1) {
                System.out.println("읽은 데이터: " + new String(buffer1, 0, bytesRead));
            } else {
                System.out.println("읽을 데이터가 없습니다.");
            }

            System.out.println("before send request");
            // 두 번째 요청을 일정 시간 후에 보내기
            Thread.sleep(5000); // 5초 후 두 번째 요청을 보냄
            String secondRequest = "GET /2 HTTP/1.1\r\nHost: localhost2\r\n\r\n";
            outputStream.write(secondRequest.getBytes());
            outputStream.flush();

            // 두 번째 응답 받기
            System.out.println("Response after second request: ");
            System.out.println("Header");
            while (!(line = reader.readLine()).isEmpty()) {
                System.out.println(line);
            }
            System.out.println("Body");
            char[] buffer2 = new char[20]; // 16문자를 저장할 배열
            bytesRead = reader.read(buffer2, 0, 20); // 최대 16문자 읽기

            // 읽은 데이터 출력
            if (bytesRead != -1) {
                System.out.println("읽은 데이터: " + new String(buffer2, 0, bytesRead));
            } else {
                System.out.println("읽을 데이터가 없습니다.");
            }
        }
    }
}
