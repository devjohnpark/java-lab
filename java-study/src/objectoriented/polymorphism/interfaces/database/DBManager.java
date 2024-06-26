package objectoriented.polymorphism.interfaces.database;

public class DBManager {
    public static IDB getDatabase(String type) {
        if (type.equalsIgnoreCase("MySQL")) {
            return new MySQLDBHandler();
        }

        if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLDBHandler();
        }

        throw new IllegalArgumentException("Unknown Database type: " + type);
    }
}
