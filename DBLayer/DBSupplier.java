package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBSupplier
{
	private Connection con;
	
	public DBSupplier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertSupplier(Supplier supplier) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Supplier(sId) VALUES('"+
				supplier.getsId()  +"'";
		
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
			System.out.println("Supplier not Created");
			throw new Exception ("Supplier is not inserted correctly");
		}
		return(rc);
	}
	
}
