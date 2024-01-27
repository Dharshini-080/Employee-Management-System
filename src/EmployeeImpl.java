import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeImpl implements EmployeeIntr
{
	Connection con;
	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 try {
			con=DBConnection.createDBConnection();
			String query="insert into employee values(?,?,?,?)";
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3,emp.getSalary());
			pstm.setInt(4, emp.getAge());
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
			{
				System.out.println("Employee inserted successfully");
			}
		} 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		try 
		{
			con=DBConnection.createDBConnection();
			String query="select*from employee";
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println("ID: " + result.getInt("id"));
	            System.out.println("Name: "+ result.getString("name"));
	            System.out.println("Salary: " + result.getDouble("salary"));
	            System.out.println("Age: " + result.getInt("age"));
	            System.out.println("------------------------------");
			}
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showEmployeeBasedOnId(int id)
	{
		// TODO Auto-generated method stub
		try 
		{
			con=DBConnection.createDBConnection();
			String query="select*from employee where id="+id;
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println("ID: " + result.getInt("id"));
	            System.out.println("Name: "+ result.getString("name"));
	            System.out.println("Salary: " + result.getDouble("salary"));
	            System.out.println("Age: " + result.getInt("age"));
	            System.out.println("------------------------------");
			}
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int id, String name)
	{
		// TODO Auto-generated method stub
		try 
		{
			con=DBConnection.createDBConnection();
			String query="update employee set name=? where id=?";
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setInt(2, id);
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
			{
				System.out.println("Employee Details updated successfully ");
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) 
	{
		// TODO Auto-generated method stub
		try 
		{
			con=DBConnection.createDBConnection();
			String query="delete from employee where id=?";
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, id);
			int cnt = pstm.executeUpdate();
			if(cnt!=0)
			{
				System.out.println("Employee deleted successfully ");
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

