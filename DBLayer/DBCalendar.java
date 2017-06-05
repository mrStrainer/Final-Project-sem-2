package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBCalendar
{
	private Connection con;
	
	public DBCalendar()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertCalendar(Calendar calendar) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Calendar( , ) VALUES('"+
				calendar.get()  + "','"  +
				calendar.get()  +"'";
		
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
			System.out.println("Calendar not Created");
			throw new Exception ("Calendar is not inserted correctly");
		}
		return(rc);
	}
	
}
