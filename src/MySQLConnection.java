import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import  java.sql.SQLException;
import java.sql.Statement;

 public class MySQLConnection {
     public static void main(String[] args)throws SQLException   {
         String url = "jdbc:mysql://localhost:3306/harsh";
         String user= "root";
         String pass= "HRathod395";
         Connection connection = null;
         try{
             connection = DriverManager.getConnection(url,user,pass);
             Statement statement= connection.createStatement();
             ResultSet resultSet= statement.executeQuery("SELECT * FROM harsh.mydetails;");
             while (resultSet.next()){
                 System.out.println(resultSet.getInt("id")+
                         "\t"+resultSet.getString("name")+
                         "\t"+ resultSet.getString("birth_date")
                 +"\t"+resultSet.getString("address"));
             }
         }
         catch (Exception e){
             System.out.println(e.getMessage());
             System.out.println("Invalid Credentials");
         }
         finally {
             connection.close();
         }
     }
}
