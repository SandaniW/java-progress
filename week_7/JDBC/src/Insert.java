import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String []args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uName = "root";
            String password = "";
            //initialize connection
            Connection connection = DriverManager.getConnection(url,uName,password);
            //sql
            String sql = "insert into department (dep_id,dep_name) values(?,?);";
            //prepare statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1003);
            preparedStatement.setString(2,"Registration");
            //execute and get return row
            int noOfRecords = preparedStatement.executeUpdate();
            //print the return
            System.out.println("no of rows affected: "+noOfRecords);


        }catch (ClassNotFoundException e){

        }catch(SQLException e){
            e.printStackTrace();

        }
    }
}
