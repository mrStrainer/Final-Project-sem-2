package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBPhotoAlbum implements IFDBPhotoAlbum
{
	private Connection con;
	
	public DBPhotoAlbum()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<PhotoAlbum> getAllPhotoAlbums(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public PhotoAlbum findPhotoAlbum(int id, boolean retriveAssociation)
	{   
		String wClause = "  id = '" + id + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	public int insertPA(PhotoAlbum pa) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO PhotoAlbum(size, pAmount, pType, cType, phId)  VALUES('"+
				pa.getSize()  + "','"  +
				pa.getPicAmount()  + "','"  +
				pa.getpType()  + "','"  +
				pa.getcType()  + "','"  +
				pa.getId() +"'";



		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("PhotoAlbum not Created");
			throw new Exception ("PhotoAlbum is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM PhotoAlbum WHERE phId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in PhotoAlbum DB: "+ex);
		}
		return(rc);
	}
	
	private PhotoAlbum singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		PhotoAlbum pObj = new PhotoAlbum();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildPhotoAlbum(results);
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
	
	private ArrayList<PhotoAlbum> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<PhotoAlbum> list = new ArrayList<PhotoAlbum>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				PhotoAlbum pObj = new PhotoAlbum();
				pObj = buildPhotoAlbum(results);	
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
		String query="SELECT * FROM PhotoAlbum";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private PhotoAlbum buildPhotoAlbum(ResultSet results)
	{   PhotoAlbum pObj = new PhotoAlbum();
	try{ 
		pObj.setSize(results.getString("size"));
		pObj.setPicAmount(results.getInt("pAmount"));
		pObj.setPType(results.getString("pType"));
		pObj.setCType(results.getString("cType"));
		pObj.setId(results.getInt("phId"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the PhotoAlbum object");
	}
	return pObj;
	}
	
}
