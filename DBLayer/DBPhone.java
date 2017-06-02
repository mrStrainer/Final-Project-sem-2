package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPhone 
{
	private Connection con;
	
	public DBPhone()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
