package DBLayer;
import ModelLayer.*;
import java.sql.*;
import java.util.ArrayList;

public class DBOrder implements IFDBPerson
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
		String query="INSERT INTO Order(fName, lName, email, address, phone, bDay)  VALUES('"+
				order.getfName()  + "','"  +
				order.getlName()  + "','"  +
				order.getEmail()  + "','"  +
				order.getAddress()  + "','"  +
				order.getPhone()  + "','"  +
				order.getbDay() +"'";


		System.out.println("insert : " + query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(SQLException ex){
			System.out.println("Person not Created");
			throw new Exception ("Person is not inserted correct");
		}
		return(rc);
	}
	
	public int delete(int id)
	{
		int rc=-1;

		String query="DELETE FROM Person WHERE pId = '" + id + "'";
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}
		catch(Exception ex){
			System.out.println("Delete exception in Person DB: "+ex);
		}
		return(rc);
	}
	
	private Person singleWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		Person pObj = new Person();

		String query =  buildQuery(wClause);
		System.out.println(query);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			if( results.next() ){
				pObj = buildPerson(results);
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
	
	private ArrayList<Person> miscWhere(String wClause, boolean retrieveAssociation)
	{
		ResultSet results;
		ArrayList<Person> list = new ArrayList<Person>();	

		String query =  buildQuery(wClause);

		try
		{ 
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);


			while( results.next() )
			{
				Person pObj = new Person();
				pObj = buildPerson(results);	
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
		String query="SELECT * FROM PERSON";

		if (wClause.length()>0)
			query=query+" WHERE "+ wClause;

		return query;
	}
	
	private Person buildPerson(ResultSet results)
	{   Person pObj = new Person();
	try{ 
		pObj.setfName(results.getString("fName"));
		pObj.setlName(results.getString("lName"));
		pObj.setEmail(results.getString("email"));
		pObj.setAddress(results.getString("address"));
		pObj.setPhone(results.getInt("phone"));
		pObj.setbDay(results.getInt("bDay"));
	}
	catch(Exception e)
	{
		System.out.println("error in building the Person object");
	}
	return pObj;
	}
	
}
