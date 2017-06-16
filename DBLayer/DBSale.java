package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBSale implements IFDBSale
{
	private Connection con;
	
	public DBSale()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public ArrayList<Sale> getAllSales(boolean retriveAssociation)
	{
		return miscWhere("", retriveAssociation);
	}

	public OrderLine findSale(int id, boolean retriveAssociation)
	{   
		String wClause = "  id = '" + id + "'";
		return singleWhere(wClause, retriveAssociation);
	}

	public int insertSale(Sale sale) throws Exception
	{  
		int rc = -1;
		String query="INSERT INTO Sale(amount, price, saleId, orderId)  VALUES('"+
				sale.getAmount()  + "','"  +
				sale.getPrice()  + "','"  +
				sale.getId()  +"'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("Sale not Created");
			throw new Exception ("Sale is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM Sale WHERE saleId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in Sale DB: "+ex);
		}
		return(rc);
	}
	
	private Sale singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		Sale pObj = new Sale();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildSale(results);
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
	
	private ArrayList<Sale> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<Sale> list = new ArrayList<Sale>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				Sale pObj = new Sale();
				pObj = buildSale(results);	
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
		String query="SELECT * FROM Sale";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private Sale buildSale(ResultSet results)
	{   Sale pObj = new Sale();
	try{ 
		pObj.setPrice(results.getString("price"));
		pObj.setAmount(results.getString("amount"));
		pObj.setId(results.getString("olId"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the Sale object");
	}
	return pObj;
	}
	
}
