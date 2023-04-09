package ddl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class AlterTable {
    public static void main(String[] args) throws SQLException{
        String url="jdbc:mysql://localhost:3306/harsh";
        String username="root";
        String password="HRathod395";
        Connection connection=null;
        connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String alterTableQuery="alter table mydetails modify column id int auto_increment;";
        //String alterTableQuery="alter table mydetails add primary key(id);";
        //true: if first object is resultSet otherwise false
         boolean b =statement.execute(alterTableQuery);
         connection.close();
        System.out.println("table is altered:"+ b);



    }
}
