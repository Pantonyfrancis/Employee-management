package employeeManagement;
import java.sql.*;
public class Connectdb {
	 public static Connection getConnection() throws SQLException
	   {
		 String url = "jdbc:mysql://localhost:3306/EmployeeDb";
	     String userName = "root";
	   	 String password = "Root";
	   	 Connection con = DriverManager.getConnection(url, userName, password);
	     return con;
	   }
}
