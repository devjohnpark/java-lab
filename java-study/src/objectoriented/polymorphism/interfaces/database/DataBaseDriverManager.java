package objectoriented.polymorphism.interfaces.database;

public class DataBaseDriverManager {
    public static IDataBaseClient getDatabase(String type) {
        if (type.equalsIgnoreCase("MySQL")) {
            return new MySQLDataBaseClient();
        }

        if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLDataBaseClient();
        }

        throw new IllegalArgumentException("Unknown Database type: " + type);
    }
}
