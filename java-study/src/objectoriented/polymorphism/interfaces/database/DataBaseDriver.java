package objectoriented.polymorphism.interfaces.database;

// 데이터베이스 드라이버
public class DataBaseDriver {
    private IDataBaseClient database;

    public DataBaseDriver(IDataBaseClient database) {
        this.database = database;
    }

    public void connectDB() {
        database.connect();
    }

    public void disconnectDB() {
        database.disconnect();
    }

    public void executeQuery(String query) {
        database.executeQuery(query);
    }

}