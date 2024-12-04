package socket;

import java.io.*;
import java.net.*;

public class BlockingRequestServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started on port 8080");

            while (true) {
                // 클라이언트 연결 기다림
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Client connected: " + clientSocket.getInetAddress());

                    // 입력 및 출력 스트림
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    OutputStream outputStream = clientSocket.getOutputStream();

                    // 첫 번째 요청을 기다리며 블로킹 테스트
                    String line = reader.readLine();  // 여기에 블로킹이 발생함
                    if (line != null) {
                        System.out.println("Received request: " + line);
                    }

                    while (!(line = reader.readLine()).isEmpty()) {
                        System.out.println(line);
                    }

                    // 간단한 응답 보내기
                    String response1 = "HTTP/1.1 200 OK\r\n\r\n1. Hello, world!\r\n";
                    outputStream.write(response1.getBytes());
                    outputStream.flush();

                    System.out.println("두번째 요청 기다리기");
                    // 클라이언트의 두 번째 요청을 기다리는 동안 블로킹
                    line = reader.readLine();  // 두 번째 요청도 기다림
                    if (line != null) {
                        System.out.println("Received second request: " + line);
                    }

                    System.out.println("두번째 요청 감지");
                    while (!(line = reader.readLine()).isEmpty()) {
                        System.out.println(line);
                    }

                    // 간단한 응답 보내기
                    String response2 = "HTTP/1.1 200 OK\r\n\r\n2. Hello, world!\r\n";
                    outputStream.write(response2.getBytes());
                    outputStream.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
