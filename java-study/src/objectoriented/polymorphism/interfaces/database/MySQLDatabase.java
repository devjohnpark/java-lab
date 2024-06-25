package objectoriented.polymorphism.interfaces.database;

// MySQL 데이터베이스 구현 클래스
class MySQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
        // MySQL 연결 로직
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
        // MySQL 연결 해제 로직
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on MySQL database: " + query);
        // MySQL 쿼리 실행 로직
    }
}