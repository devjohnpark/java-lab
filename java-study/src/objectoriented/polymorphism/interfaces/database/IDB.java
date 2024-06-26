package objectoriented.polymorphism.interfaces.database;

// 데이터베이스 관련 인터페이스 정의
interface IDB {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
