package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCamera 
{
	private Connection con;
	
	public DBCamera()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
