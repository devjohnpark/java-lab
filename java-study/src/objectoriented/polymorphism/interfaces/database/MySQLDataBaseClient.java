package objectoriented.polymorphism.interfaces.database;

// MySQL 데이터베이스 클라이언트 구현 클래스
class MySQLDataBaseClient implements IDataBaseClient {
    @Override
    public void connect() {
        // MySQL 연결 로직
        mysqlConnect();
    }

    @Override
    public void disconnect() {
        // MySQL 연결 해제 로직
        mysqlDisconnect();
    }

    @Override
    public void executeQuery(String query) {
        // MySQL 쿼리 실행 로직
        mysqlExecuteQuery(query);
    }

    private void mysqlConnect() {
        System.out.println("Connecting to MySQL database...");
    }

    private void mysqlDisconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }

    private void mysqlExecuteQuery(String query) {
        System.out.println("Executing query on MySQL database: " + query);
    }
}