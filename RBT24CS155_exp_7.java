import java.sql.*;

public class RBT24CS155_exp_7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");

            System.out.println("Database Connected Successfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}