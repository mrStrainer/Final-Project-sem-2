package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBMemory 
{
	private Connection con;
	
	public DBMemory()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
