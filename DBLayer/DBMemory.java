package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBMemory implements IFDBMemory
{
	private Connection con;
	
	public DBMemory()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertMemory(Memory memory) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Memory(scSize, RAM, mId) VALUES('"+
				memory.getSize()  + "','"  +
				memory.getType()  + "','"  +
				memory.getId()  +"'";
		
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
			System.out.println("Memory not Created");
			throw new Exception ("Memory is not inserted correctly");
		}
		return(rc);
	}
	
}
