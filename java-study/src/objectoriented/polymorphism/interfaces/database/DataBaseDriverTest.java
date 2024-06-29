package objectoriented.polymorphism.interfaces.database;

public class DataBaseDriverTest {
    public static void main(String[] args) {
        MySQLDataBaseClient mysqlDBClient = new MySQLDataBaseClient();
        PostgreSQLDataBaseClient postgreSQLDBClient = new PostgreSQLDataBaseClient();

        DataBaseDriver dbDriver1 = new DataBaseDriver(mysqlDBClient);
        dbDriver1.connectDB();
        dbDriver1.executeQuery("SELECT * FROM users;");

        DataBaseDriver dbDriver2 = new DataBaseDriver(postgreSQLDBClient);
        dbDriver2.connectDB();
        dbDriver2.executeQuery("SELECT * FROM users;");

        dbDriver1.disconnectDB();
        dbDriver2.disconnectDB();

        IDataBaseClient iDatabase = DataBaseDriverManager.getDatabase(DataBaseType.Mysql);
        DataBaseDriver dbDriver = new DataBaseDriver(iDatabase);
        dbDriver.connectDB();
        dbDriver.executeQuery("SELECT * FROM users;");
        dbDriver.disconnectDB();
    }
}
