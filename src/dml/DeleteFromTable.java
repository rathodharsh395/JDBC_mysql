package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DeleteFromTable {
    public static void main(String[] args)throws SQLException {
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";
        Connection connection= null;
        connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String deleteQuery="delete from course where course_id=6";
        int deleted= statement.executeUpdate(deleteQuery);//DML query: executeUpdate();
        connection.close();
        System.out.println("Record Deleted:"+deleted);
    }
}
