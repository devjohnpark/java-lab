package objectoriented.polymorphism.interfaces.database;

// 데이터베이스와 연동하는 애플리케이션
public class Application {
    private DataBaseDriver database;

    public Application(DataBaseDriver database) {
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