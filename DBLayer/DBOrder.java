package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBOrder implements IFDBOrder
{
	private Connection con;
	
	public DBOrder()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
