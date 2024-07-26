package objectoriented.polymorphism.interfaces.database;

public class DataBaseTest {
    public static void main(String[] args) {
        MySQLDataBaseDriver mysqlDBDriver = new MySQLDataBaseDriver();
        PostgreSQLDataBaseDriver postgreSQLDBDriver = new PostgreSQLDataBaseDriver();

        Application app1 = new Application(mysqlDBDriver);
        app1.connectDB();
        app1.executeQuery("SELECT * FROM users;");

        Application app2 = new Application(postgreSQLDBDriver);
        app2.connectDB();
        app2.executeQuery("SELECT * FROM users;");

        app1.disconnectDB();
        app2.disconnectDB();

        DataBaseDriver dataBaseDriver = DataBaseDriverManager.getDatabase(DataBaseType.Mysql);
        Application app = new Application(dataBaseDriver);
        app.connectDB();
        app.executeQuery("SELECT * FROM users;");
        app.disconnectDB();
    }
}
