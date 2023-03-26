package statementsBatch;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertMultipleRecords1 {
    public static void main(String[] args)throws SQLException {
        String url= "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "HRathod395";

        Connection connection=null ;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query1 = "insert into course(course_name,course_fees)values('SQL','26hours');";
            System.out.println(statement.executeUpdate(query1));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
            connection.close();
        System.out.println("Multiple Records Inserted Successfully");

    }

}
