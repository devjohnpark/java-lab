package objectoriented.polymorphism.interfaces.database;

public class ApplicationTest {
    public static void main(String[] args) {
        MySQLDatabase mysqlDatabase = new MySQLDatabase();
        PostgreSQLDatabase postgresqlDatabase = new PostgreSQLDatabase();

        Application instagram = new Application(mysqlDatabase);
        instagram.run();

        Application facebook = new Application(postgresqlDatabase);
        facebook.run();
    }
}
