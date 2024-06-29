package objectoriented.polymorphism.interfaces.database;

public class DataBaseDriverManager {
    public static IDataBaseClient getDatabase(DataBaseType databaseType) {
        switch (databaseType) {
            case Mysql:
                return new MySQLDataBaseClient();
            case Postresql:
                return new PostgreSQLDataBaseClient();
            default:
                throw new IllegalArgumentException("Unknown Database type: " + databaseType);
        }
    }
}
