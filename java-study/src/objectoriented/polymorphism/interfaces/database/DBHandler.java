package objectoriented.polymorphism.interfaces.database;

public class DBHandler {
    private IDB database;

    public DBHandler(IDB database) {
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