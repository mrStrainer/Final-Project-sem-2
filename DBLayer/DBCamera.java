package DBLayer;
import ModelLayer.*;
import java.sql.*;
//name, price, salePrice, stock, brand, description, 
public class DBCamera implements IFDBCamera
{
	private Connection con;
	
	public DBCamera()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public int insertCamera(Camera camera) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Camera(type, Resolution, camId) VALUES('"+
				camera.getType()  + "','"  +
				camera.getResolution()  + "','"  +
				camera.getId()  +"'";
		
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
			System.out.println("Camera not Created");
			throw new Exception ("Camera is not inserted correctly");
		}
		return(rc);
	}
	
}
