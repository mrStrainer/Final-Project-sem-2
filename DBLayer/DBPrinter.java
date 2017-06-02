package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPrinter 
{
	private Connection con;
	
	public DBPrinter()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
