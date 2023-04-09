package ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TruncateTable {
    public static void main(String[] args)throws SQLException{
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";
        Connection connection=null;
        connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String truncateTableQuery="truncate table movie";
        boolean isTableTruncate =statement.execute(truncateTableQuery);
        //Returns:true if the first result is a ResultSet object; false if it is an update count or there are no results
        connection.close();
        System.out.println("Table is truncate:"+isTableTruncate);


    }
}