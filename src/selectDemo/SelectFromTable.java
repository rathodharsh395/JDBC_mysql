package selectDemo;
// DQL: Data Query Language
import java.sql.*;
public class SelectFromTable {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "HRathod395";
        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        /*String query1= "insert into course(course_id,course_name,course_duration,course_fees)"+
          "values(20, 'framework', '60hours', '20thousand');";*/
        String query2 = "select * from course;";
            //int t= statement.executeUpdate(query1);
        ResultSet resultSet= statement.executeQuery(query2);
        while(resultSet.next()){
            System.out.println(resultSet.getInt("course_id")+"\t"+
                          resultSet.getString("course_name")+"\t"+
                      resultSet.getString("course_duration")+"\t"+
                          resultSet.getString("course_fees")     );
        }
        String query3= "select course_name from course";
        ResultSet resultSet1=statement.executeQuery(query3);
        while (resultSet1.next()){
                System.out.println(resultSet1.getString("course_name"));
        }
        connection.close();

    }
}
