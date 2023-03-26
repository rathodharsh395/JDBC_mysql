package statementsBatch;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertMultipleRecords2 {
    public static void main(String[] args)throws SQLException {
        String url= "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "HRathod395";
        String Query1 = "insert into practice(col1,col2,col3)values(20,'april',2001);";
        String Query2 = "insert into practice(col1,col2,col3)values(30,'may',2002);";
        String Query3 = "insert into practice(col1,col2,col3)values(40,'june',2003);";

        Connection connection= null;
        try{
            connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            statement.addBatch(Query1);
            statement.addBatch(Query2);
            statement.addBatch(Query3);
            int[] resultSet= statement.executeBatch();
        }
        catch (Exception e){
           e.getMessage();
        }
        connection.close();
        System.out.println("details added successfully ");

    }
}
