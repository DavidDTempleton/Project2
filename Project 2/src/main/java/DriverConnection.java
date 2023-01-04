import com.revature.util.JDBCConnectionUTIL;

import java.sql.Connection;
import java.sql.SQLException;

public class DriverConnection {

    public static void main(String[] args) {

        try (Connection conn = JDBCConnectionUTIL.getConnectionThroughENV()) {
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
