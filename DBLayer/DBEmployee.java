package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBEmployee implements IFDBEmployee
{
	private Connection con;
	
	public DBEmployee()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertEmployee(Employee employee) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Employee(eId) VALUES('"+
				employee.getId()  +"'";
		
		System.out.println("insert : " + query);
		try
		{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex)
		{
			System.out.println("Employee not Created");
			throw new Exception ("Employee is not inserted correctly");
		}
		return(rc);
	}
	
}
