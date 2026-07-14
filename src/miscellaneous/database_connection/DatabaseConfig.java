package miscellaneous.database_connection;

import java.sql.*;

public class DatabaseConfig {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hrms";
        String user = "root";
        String pass = "root";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            ps = con.prepareStatement("SELECT * FROM employee_master");
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("emp id: " + rs.getInt("staff_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Process Done!");
            try { if (rs != null) rs.close(); } catch (Exception ignored) {}
            try { if (ps != null) ps.close(); } catch (Exception ignored) {}
            try { if (con != null) con.close(); } catch (Exception ignored) {}
        }
    }

}
