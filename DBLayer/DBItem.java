package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBItem
{
	private Connection con;
	
	public DBItem()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
