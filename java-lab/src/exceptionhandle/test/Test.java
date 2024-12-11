package exceptionhandle.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Test {

    public void method1() throws SocketTimeoutException {
        try {
            method2();
        } catch (IOException e) {
            System.out.println("catch SocketTimeoutException");
        }
    }

    public void method2() throws IOException {
        throw new SocketTimeoutException();
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.method1();
        } catch (SocketTimeoutException e) {
            System.out.println("catch SocketTimeoutException");
        }
    }
}
