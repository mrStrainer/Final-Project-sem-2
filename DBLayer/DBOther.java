package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBOther 
{
	private Connection con;
	
	public DBOther()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
