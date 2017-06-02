package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBEmployee 
{
	private Connection con;
	
	public DBEmployee()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
