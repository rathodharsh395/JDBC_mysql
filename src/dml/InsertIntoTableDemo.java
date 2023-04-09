package dml;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertIntoTableDemo {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
        //steps to connect to database
        //step1: load the driver class in the memory
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step2: Driver registration with DriverManager.
        //Once the Driver class is loaded in the memory then its static block will be executed
        //Instance of the Driver class will be passed to the DriverManage.registerDriver(new Driver());

        //step3: Get Connection
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            int inserted =statement.executeUpdate("insert into student values(3,'chorngar Bongar',899916)");

            System.out.println("record is inserted"+inserted);
        }
        catch(Exception i){
            i.getMessage();
        }
        finally {
            connection.close();
        }
    }
}
