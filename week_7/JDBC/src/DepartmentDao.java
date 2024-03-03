import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDao {
    Connection connection;
    String sql;
    int noOfRecords;

    //insert
    public int addDepartment(Department department){
        try{
            connection = DatabaseConnection.getConnection();
            sql = "insert into department (dep_id,dep_name) values(?,?);";
            //prepare statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,department.getDepartmentId());
            preparedStatement.setString(2,department.getDepartmentName());
            //execute and get return row
            int noOfRecords = preparedStatement.executeUpdate();
            //print the return
            System.out.println("no of rows affected: "+noOfRecords);
            //close connection
            connection.close();

        }catch (ClassNotFoundException | SQLException e){

        }
        return noOfRecords;

    }

    //update
    public int updateDepartment(Department department){
        try{
            connection = DatabaseConnection.getConnection();
            sql = "insert into department (dep_id,dep_name) values(?,?);";
            //prepare statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,department.getDepartmentId());
            preparedStatement.setString(2,department.getDepartmentName());
            //execute and get return row
            int noOfRecords = preparedStatement.executeUpdate();
            //print the return
            System.out.println("no of rows affected: "+noOfRecords);

        }catch (ClassNotFoundException | SQLException e){

        }
        return noOfRecords;

    }
    //delete
    public int deleteDepartment(Department department){
        try{
            connection = DatabaseConnection.getConnection();
            sql = "delete from department where dep_id=?";
            //prepare statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,department.getDepartmentId());
            //execute and get return row
            int noOfRecords = preparedStatement.executeUpdate();
            //print the return
            System.out.println("no of rows affected: "+noOfRecords);

        }catch (ClassNotFoundException | SQLException e){

        }
        return noOfRecords;

    }

    //delete

}
