package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCustomer implements IFDBCustomer
{
	private Connection con;
	
	public DBCustomer()
	{
		con = DBConnection.getInstance().getDBcon();
	}

}
