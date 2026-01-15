package question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCivilStudents {

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "1234"
            );

            Statement stmt = con.createStatement();

            String delete =
                    "DELETE FROM students " +
                    "WHERE year_of_passing = 2024 AND branch = 'Civil'";

            int rows = stmt.executeUpdate(delete);
            System.out.println(rows + " records deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    

	}

}
