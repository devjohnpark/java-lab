package objectoriented.polymorphism.interfaces.database;

public class DBTest {
    public static void main(String[] args) {
        MySQLDBHandler mysqlDatabase = new MySQLDBHandler();
        PostgreSQLDBHandler postgresqlDatabase = new PostgreSQLDBHandler();

        DBHandler instagram = new DBHandler(mysqlDatabase);
        instagram.connectDB();
        instagram.executeQuery("SELECT * FROM users;");

        DBHandler facebook = new DBHandler(postgresqlDatabase);
        facebook.connectDB();
        facebook.executeQuery("SELECT * FROM users;");

        instagram.disconnectDB();
        facebook.disconnectDB();


        IDB iDatabase = DBManager.getDatabase("MySQL");
        DBHandler dbHandler = new DBHandler(iDatabase);
        dbHandler.connectDB();
        dbHandler.executeQuery("SELECT * FROM users;");
        dbHandler.disconnectDB();
    }
}
