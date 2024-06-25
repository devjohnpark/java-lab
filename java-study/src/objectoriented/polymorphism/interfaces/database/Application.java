package objectoriented.polymorphism.interfaces.database;

// 데이터베이스를 이용한 응용 프로그램
public class Application {
    private IDatabase database;

    Application(IDatabase database) {
        this.database = database;
    }

    public void run() {
        database.connect();
        database.executeQuery("SELECT * FROM users");
        database.disconnect();
    }
}