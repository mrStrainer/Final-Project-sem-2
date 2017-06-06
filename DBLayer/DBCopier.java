package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBCopier implements IFDBCopier
{
	private Connection con;
	
	public DBCopier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertCopier(Copier copier) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Copier(type, speed, copyId) VALUES('"+
				copier.getType()  + "','"  +
				copier.getSpeed()  + "','"  +
				copier.getId()  +"'";
		
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
			System.out.println("Copier not Created");
			throw new Exception ("Copier is not inserted correctly");
		}
		return(rc);
	}
	
}
