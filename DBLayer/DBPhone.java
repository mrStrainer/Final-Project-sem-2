package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBPhone implements IFDBPhone
{
	private Connection con;
	
	public DBPhone()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertPhone(Phone phone) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Phone(scSize, RAM, phoneId) VALUES('"+
				phone.getScSize()  + "','"  +
				phone.getRAM()  + "','"  +
				phone.getId()  +"'";
		
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
			System.out.println("Phone not Created");
			throw new Exception ("Phone is not inserted correctly");
		}
		return(rc);
	}

	
}
