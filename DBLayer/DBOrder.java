package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBOrder implements IFDBOrder
{
	private Connection con;
	
	public DBOrder()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Order> getAllOrders(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public int insertOrder(Order order) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Order(orderId, totalPrice)  VALUES('"+
				order.getId()  + "','"  +
				order.getTotalPrice()  + "'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("Order not Created");
			throw new Exception ("Order is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM Order WHERE orderId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in Order DB: "+ex);
		}
		return(rc);
	}
	
	private Person singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		Order pObj = new Order();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildOrder(results);
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
	
	private ArrayList<Order> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<Order> list = new ArrayList<Order>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				Order pObj = new Order();
				pObj = buildOrder(results);	
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
		String query="SELECT * FROM Order";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private Order buildOrder(ResultSet results)
	{   Order pObj = new Order();
	try{ 
		pObj.setIdresults.getString("orderId"));
		pObj.setTotalPrice(results.getString("totalPrice"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the Order object");
	}
	return pObj;
	}
	
}
