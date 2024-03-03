import java.sql.*;

public class DatabaseConnection{
    public static void main(String []args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcURL="jdbc:mysql://localhost:3306/java";
            String userName="root";
            String password="";
            Connection connection= DriverManager.getConnection(jdbcURL,userName,password);
            if(connection!=null){
                System.out.println("DB connected...");
                System.out.println(connection.getMetaData().getDatabaseProductName());
            }
            String sql = "select dep_id,dep_name from department where dep_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1001);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("dep_id"));
                System.out.println(resultSet.getString("dep_name"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
