package question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayECStudents {

	public static void main(String[] args) {
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/college",
	                    "root",
	                    "1234"
	            );

	            Statement stmt = con.createStatement();

	            String select =
	                    "SELECT * FROM students " +
	                    "WHERE semester = 7 AND branch = 'EC'";

	            ResultSet rs = stmt.executeQuery(select);

	            System.out.println("ID  Name   Branch  Sem  %   Year");
	            System.out.println("--------------------------------");

	            while (rs.next()) {
	                System.out.println(
	                        rs.getInt("id") + "  " +
	                        rs.getString("name") + "  " +
	                        rs.getString("branch") + "  " +
	                        rs.getInt("semester") + "  " +
	                        rs.getDouble("percentage") + "  " +
	                        rs.getInt("year_of_passing")
	                );
	            }

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    

	}

}
