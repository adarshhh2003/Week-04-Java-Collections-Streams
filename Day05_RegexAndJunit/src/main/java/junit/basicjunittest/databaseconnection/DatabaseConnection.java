package junit.basicjunittest.databaseconnection;

public class DatabaseConnection {

    private boolean isConnected = false;

    // Simulates connecting to a database
    public void connect() {
        isConnected = true;
        System.out.println("Connected to the database.");
    }

    // Simulates disconnecting from a database
    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from the database.");
    }

    // Checks if the connection is active
    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection database = new DatabaseConnection();

        database.connect();
        database.disconnect();
        System.out.println("Check the connectivity: " + database.isConnected);
    }
}