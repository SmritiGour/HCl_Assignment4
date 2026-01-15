package question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateAndInsertStudents {

	public static void main(String[] args) {
		  

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1234");
		                    
		            

		            Statement stmt = con.createStatement();

		            String createTable =
		                    "CREATE TABLE IF NOT EXISTS students (" +
		                    "id INT PRIMARY KEY, " +
		                    "name VARCHAR(50), " +
		                    "branch VARCHAR(20), " +
		                    "semester INT, " +
		                    "percentage DOUBLE, " +
		                    "year_of_passing INT)";

		            stmt.execute(createTable);

		            String insert =
		                    "INSERT INTO students VALUES " +
		                    "(1,'Aniket','CSE',7,75.5,2025)," +
		                    "(2,'Ravi','EC',7,72.0,2025)," +
		                    "(3,'Neha','Civil',6,68.0,2024)," +
		                    "(4,'Aman','CSE',8,80.0,2024)";

		            stmt.executeUpdate(insert);

		            System.out.println("Table created and records inserted");

		            con.close();

		        } catch (Exception e) {
		            e.printStackTrace();
		        }

	}

}
