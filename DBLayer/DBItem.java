package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBItem implements IFDBItem
{
	private Connection con;
	
	public DBItem()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
