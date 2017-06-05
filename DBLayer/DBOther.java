package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBOther
{
	private Connection con;
	
	public DBOther()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertOther(Other Other) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Other(oId) VALUES('"+
				Other.getId()  +"'";
		
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
			System.out.println("Other not Created");
			throw new Exception ("Other is not inserted correctly");
		}
		return(rc);
	}
	
}
