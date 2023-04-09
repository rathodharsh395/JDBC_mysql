package dml;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args)throws SQLException{
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            String InserQuery="insert into course(course_id,course_name,course_duration,course_fees)" +
                    "value(14,'javascript','15 hours','11thousand')," +
                    "(15,'swift','16 hours','12 thousand')";

            int insertedOrNot = statement.executeUpdate(InserQuery);//DML query : executeUpdate();
           //returns: either (1) the row count for SQL Data Manipulation Language (DML) statements or (2) 0 for SQL statements that return nothing
            System.out.println("record inserted successfully"+insertedOrNot);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

}
