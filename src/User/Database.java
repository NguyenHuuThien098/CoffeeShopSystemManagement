package User;
import java.sql.*;

public class Database {
    Connection linkDatabase;
    String databaseName = "coffeeshop";
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
