package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBService 
{
	private Connection con;
	
	public DBService()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
