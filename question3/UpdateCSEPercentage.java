package question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateCSEPercentage {

	public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "1234"
            );

            Statement stmt = con.createStatement();

            String update =
                    "UPDATE students " +
                    "SET percentage = percentage + (percentage * 0.05) " +
                    "WHERE branch = 'CSE'";

            int rows = stmt.executeUpdate(update);
            System.out.println(rows + " records updated");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
