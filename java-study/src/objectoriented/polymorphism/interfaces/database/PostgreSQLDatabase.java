package objectoriented.polymorphism.interfaces.database;

// PostgreSQL 데이터베이스 구현 클래스
class PostgreSQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
        // PostgreSQL 연결 로직
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
        // PostgreSQL 연결 해제 로직
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on PostgreSQL database: " + query);
        // PostgreSQL 쿼리 실행 로직
    }
}