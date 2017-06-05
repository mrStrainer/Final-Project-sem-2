package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBPrinter
{
	private Connection con;
	
	public DBPrinter()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertPrinter(Printer printer) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Printer(type, size, pId) VALUES('"+
				printer.getType()  + "','"  +
				printer.getSize()  + "','"  +
				printer.getId()  +"'";
		
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
			System.out.println("Printer not Created");
			throw new Exception ("Printer is not inserted correctly");
		}
		return(rc);
	}
	
}
