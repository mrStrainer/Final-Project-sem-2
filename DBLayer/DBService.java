package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBService implements IFDBService
{
	private Connection con;
	
	public DBService()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Service> getAllServices(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public Service findService(int id, boolean retriveAssociation)
	{   
		String wClause = "  id = '" + id + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	public int insertService(Service service) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Service(startDate, description, location, status, serviceId) VALUES('"+
				service.getStartDate()  + "','"  +
				service.getDescription()  + "','"  +
				service.getLocation()  + "','"  +
				service.getStatus()  + "','"  +
				service.getId() +"'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("Service not Created");
			throw new Exception ("Service is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM Service WHERE serviceId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in Service DB: "+ex);
		}
		return(rc);
	}
	
	private Service singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		Service pObj = new Service();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildService(results);
			}
			else{ 
				pObj = null;
			}
			stmt.close();

		}	
		catch(Exception e){
			System.out.println("Query exception: "+e);
		}
		return pObj;
	}
	
	private ArrayList<Service> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<Service> list = new ArrayList<Service>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				Service pObj = new Service();
				pObj = buildService(results);	
				list.add(pObj);	
			}
			stmt.close();     
		}
		catch(Exception e)
		{
			System.out.println("Query exception - select: "+e);
			e.printStackTrace();
		}
		return list;
	}
	
	private String buildQuery(String wClause)
	{
		String query="SELECT * FROM Service";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private Service buildService(ResultSet results)
	{   Service pObj = new Service();
	try{ 
		pObj.setStartDate(results.getString("startDate"));
		pObj.setDescription(results.getString("description"));
		pObj.setLocation(results.getString("location"));
		pObj.setStatus(results.getBoolean("status"));
		pObj.setID(results.getInt("serviceId"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the Service object");
	}
	return pObj;
	}
	
}
