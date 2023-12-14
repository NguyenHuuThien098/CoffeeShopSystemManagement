package Admin;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    Connection linkDatabase;
    String databaseName = "coffeeshop1";
    String user = "root";
    String password = "root";
    String URL = "jdbc:mysql://127.0.0.1:3306/" + databaseName;
    
    public Database(){}

    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            linkDatabase = DriverManager.getConnection(URL, user, password);
        } catch (Exception e) {
            System.out.println("Failed to connect to the database!");
        }
        
        return linkDatabase;
    }
}   
