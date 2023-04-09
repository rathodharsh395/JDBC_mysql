package ddl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args)throws SQLException {
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String passoword="HRathod395";
        Connection connection = DriverManager.getConnection(url, username, passoword);
        Statement statement = connection.createStatement();
        String createTableQuery = "create table movie(Goners varchar(40),Hollywood int,Bollywood int,Tollywood int);";
        //Returns:true if the first result is a ResultSet object; false if it is an update count or there are no results
         boolean isTableCreated=statement.execute(createTableQuery);
        connection.close();
        System.out.println("Table is created"+ isTableCreated);



    }
}
