import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[]args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uName = "root";
            String pw = "";

            Connection connection = DriverManager.getConnection(url, uName, pw);

            String sql = "update department set dep_name=? where dep_id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "HR");
            preparedStatement.setInt(2, 1002);

            int noOfRecords = preparedStatement.executeUpdate();


            System.out.println("No of row: "+ noOfRecords);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();


        }
    }
}
