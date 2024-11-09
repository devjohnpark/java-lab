package objectoriented.polymorphism.interfaces.database;

public class DataBaseDriverManager {
    public static DataBaseDriver getDatabase(DataBaseType databaseType) {
        switch (databaseType) {
            case Mysql:
                return new MySQLDataBaseDriver();
            case Postresql:
                return new PostgreSQLDataBaseDriver();
            default:
                throw new IllegalArgumentException("Unknown Database type: " + databaseType);
        }
    }
}
