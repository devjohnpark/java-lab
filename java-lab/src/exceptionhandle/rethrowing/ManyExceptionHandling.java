package exceptionhandle.rethrowing;

import java.io.IOException;
import java.sql.SQLException;

// 여러 예외 중 일부는 메서드 내에서 처리하고, 나머지는 호출한 메서드에서 처리
public class ManyExceptionHandling {
    public static void method() throws SQLException {
        try {
            if (true)
                throw new IOException("입출력 오류 발생");
            if (true)
                throw new SQLException("데이터베이스 오류 발생");
        } catch (IOException e) {
            // IOException은 이 메서드 내에서 처리
            System.err.println("IOException 처리: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (SQLException e) {
            // SQLException은 호출한 메서드에서 처리
            e.printStackTrace();
        }
    }
}
