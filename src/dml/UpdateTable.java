package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class UpdateTable {
    public static void main(String[] args)throws SQLException {
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String passwork="HRathod395";
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, username, passwork);
            Statement statement =connection.createStatement();
            String updateQuery="update course set course_id=19 where course_name='python' ";
            int updated = statement.executeUpdate(updateQuery);//DML query: executeUpdate();
            System.out.println("record is updated"+ updated);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
