package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBOrderLine 
{
	private Connection con;
	
	public DBOrderLine()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
