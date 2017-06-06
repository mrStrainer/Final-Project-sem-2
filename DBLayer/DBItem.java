package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBItem implements IFDBPerson
{
	private Connection con;
	
	public DBItem()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public Item findItem(int id, boolean retriveAssociation)
	{   
		String wClause = "  id = '" + id + "'";
		return singleWhere(wClause, retriveAssociation);
	}
	
	public ArrayList<Item> getAllItems(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public int insertItem(Item item) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Item(name, price, salePrice, stock, brand, description)  VALUES('"+
				item.getName()  + "','"  +
				item.getPrice()  + "','"  +
				item.getSPrice()  + "','"  +
				item.getStock()  + "','"  +
				item.getBrand()  + "','"  +
				item.getDescription() +"'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("Item not Created");
			throw new Exception ("Item is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM Item WHERE iId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in Item DB: "+ex);
		}
		return(rc);
	}
	
	private Item singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		Item iObj = new Item();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				iObj = buildItem(results);
			}
			else{ 
				iObj = null;
			}
			stmt.close();

		}	
		catch(Exception e){
			System.out.println("Query exception: "+e);
		}
		return iObj;
	}
	
	private ArrayList<Item> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<Item> list = new ArrayList<Item>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				Item iObj = new Item();
				iObj = buildItem(results);	
				list.add(iObj);	
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
		String query="SELECT * FROM ITEM";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private Item buildItem(ResultSet results)
	{   Item iObj = new Item();
	try{ 
		iObj.setName(results.getString("name"));
		iObj.setPrice(results.getInt("price"));
		iObj.setSPrice(results.getInt("sale price"));
		iObj.setStock(results.getInt("stock"));
		iObj.setBrand(results.getString("brand"));
		iObj.setDescription(results.getString("description"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the Item object");
	}
	return iObj;
	}
	
}
