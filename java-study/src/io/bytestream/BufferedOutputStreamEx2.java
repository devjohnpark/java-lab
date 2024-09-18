package io.bytestream;

import java.io.*;

public class BufferedOutputStreamEx2 {
    private static final String ROOT_DIR = "io-test/";
    private static final String FILE_NAME = "123456789.txt";

    static public String getFileName() {
        return ROOT_DIR + FILE_NAME;
    }

    public static void main(String[] args) {
        // 출력 스트림으로 출력소스에서 데이터 쓰기
        try {
            // 파일에 데이터를 쓰기 위한 FileOutputStream과 BufferedOutputStream을 생성
            FileOutputStream fos = new FileOutputStream(getFileName());
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            // 버퍼에 데이터 저장
            byte[] data = "123456789".getBytes();
            bos.write(data);  // 배열 전체를 버퍼로 전송

            // 버퍼에 남아 있는 데이터를 디스크로 전송
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 입력 스트림으로 입력소스에서 데이터 읽어오기
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(getFileName()), 10);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
