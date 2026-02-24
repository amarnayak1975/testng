package testngselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

    public static Object[][] getMySQLData() {

        List<Object[]> data = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Alprex.25"; // change as per your MySQL

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM login_data");

            while (rs.next()) {
                data.add(new Object[] {
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("result")
                });
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data.toArray(new Object[0][]);
    }

	
}
