package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBCustomer
{
	private Connection con;
	
	public DBCustomer()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertCustomer(Customer customer) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Customer(cId) VALUES('"+
				customer.getcId()  +"'";
		
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
			System.out.println("Customer not Created");
			throw new Exception ("Customer is not inserted correctly");
		}
		return(rc);
	}
	
}
