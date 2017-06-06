package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBOrderLine implements IFDBOrderLine
{
	private Connection con;
	
	public DBOrderLine()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<OrderLine> getAllOrderLines(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public OrderLine findOrderLine(int id, boolean retriveAssociation)
	{   
		String wClause = "  id = '" + id + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	public int insertOrderLine(OrderLine ol) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO OrderLine(price, amount, olId)  VALUES('"+
				ol.getPrice()  + "','"  +
				ol.getAmount()  + "','"  +
				ol.getId()  +"'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("OrderLine not Created");
			throw new Exception ("OrderLine is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM OrderLine WHERE olId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in OrderLine DB: "+ex);
		}
		return(rc);
	}
	
	private OrderLine singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		OrderLine pObj = new OrderLine();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildOrderLine(results);
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
	
	private ArrayList<OrderLine> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<OrderLine> list = new ArrayList<OrderLine>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				OrderLine pObj = new OrderLine();
				pObj = buildOrderLine(results);	
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
		String query="SELECT * FROM OrderLine";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private OrderLine buildOrderLine(ResultSet results)
	{   OrderLine pObj = new OrderLine();
	try{ 
		pObj.setPrice(results.getString("price"));
		pObj.setAmount(results.getString("amount"));
		pObj.setId(results.getString("olId"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the OrderLine object");
	}
	return pObj;
	}
	
}
