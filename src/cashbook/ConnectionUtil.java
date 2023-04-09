package cashbook;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "HRathod395";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e) {
           e.getMessage();
        }
      return connection;
    }
}

