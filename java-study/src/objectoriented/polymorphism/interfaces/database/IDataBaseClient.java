package objectoriented.polymorphism.interfaces.database;

// 데이터베이스 클라이언트 관련 인터페이스 정의
interface IDataBaseClient {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
