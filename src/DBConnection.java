import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection 
{
	static Connection con;
	public static Connection createDBConnection() throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employeeDB";
			String username="root";
			String password="Dharshini@08";
			con = DriverManager.getConnection(url,username,password);
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}