package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBOther implements IFDBOther
{
	private Connection con;
	
	public DBOther()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
