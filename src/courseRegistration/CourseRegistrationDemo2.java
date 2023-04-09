package courseRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class CourseRegistrationDemo2 {
    public static void main(String[] args)throws SQLException {
        //accept the details from user for course
        Scanner hr= new Scanner(System.in);
        System.out.println("enter the course name");
        String courseName = hr.nextLine();

        System.out.println("enter the course duration");
        String courseDuration=hr.nextLine();

        System.out.println("enter the course fees");
        String courseFees=hr.nextLine();

        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";

        Connection connection=null;

        connection= DriverManager.getConnection(url,username,password);
        String insertQuery="insert into course(course_name,course_duration,course_fees) values(?,?,?)";
        PreparedStatement preparedStatement =connection.prepareStatement(insertQuery);
        preparedStatement.setString(1,courseName);
        preparedStatement.setString(2,courseDuration);
        preparedStatement.setString(3,courseFees);
        int inserted =preparedStatement.executeUpdate();

        connection.close();
        System.out.println("Course registered"+inserted);
    }
}
