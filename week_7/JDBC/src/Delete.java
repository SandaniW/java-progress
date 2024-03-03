import java.sql.Connection;
import java.sql.DriverManager;

public class Delete {
    public static void main(String []args){
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java";
        String uName = "root";
        String pw = "";

        Connection connection = DriverManager.getConnection(url,uName,pw);

        String sql
    }
}
