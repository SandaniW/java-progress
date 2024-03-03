import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static String url;
    static String uName;
    static String password;
    static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/java";
        uName = "root";
        password = "";
        //initialize connection
        connection = DriverManager.getConnection(url,uName,password);
        return connection;
    }
}
