package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCustomer 
{
	private Connection con;
	
	public DBCustomer()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
