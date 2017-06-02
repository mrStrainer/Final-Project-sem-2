package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCopier 
{
	private Connection con;
	
	public DBCopier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
