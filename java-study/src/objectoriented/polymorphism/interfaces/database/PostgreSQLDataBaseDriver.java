package objectoriented.polymorphism.interfaces.database;

// PostgreSQL 데이터베이스 드라이버 구현 클래스
class PostgreSQLDataBaseDriver implements DataBaseDriver {
    @Override
    public void connect() {
        // PostgreSQL 연결 로직
        postresqlConnect();
    }

    @Override
    public void disconnect() {
        // PostgreSQL 연결 해제 로직
        postrsqlDisconnect();
    }

    @Override
    public void executeQuery(String query) {
        // PostgreSQL 쿼리 실행 로직
        postrsqlExecuteQuery(query);
    }

    private void postresqlConnect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    private void postrsqlDisconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }

    private void postrsqlExecuteQuery(String query) {
        System.out.println("Executing query on PostgreSQL database: " + query);
    }
}