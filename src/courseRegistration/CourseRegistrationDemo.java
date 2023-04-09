package courseRegistration;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CourseRegistrationDemo {
    public static void main(String[] args)throws SQLException {
        //accept the details from user for course
        Scanner hr= new Scanner(System.in);
        System.out.println("Enter the course name");
        String courseName= hr.nextLine();

        System.out.println("Enter the course Duration");
        String courseDuration= hr.nextLine();

        System.out.println("Enter the course Fees");
        String courseFees=hr.nextLine();

        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="HRathod395";

        Connection connetion=null;
        connetion= DriverManager.getConnection(url,username,password);
        Statement statement =connetion.createStatement();
        String insertQuery="insert into course(course_name,course_duration,course_fees)" +
                "values('"+ courseName+"',"+""+"'"+courseDuration+"','"+courseFees+"')";
        int inserted = statement.executeUpdate(insertQuery);
        connetion.close();
        System.out.println("Course registered:"+ inserted);

    }
}
