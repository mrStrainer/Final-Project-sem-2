package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBSupplier 
{
	private Connection con;
	
	public DBSupplier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
