package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCopier implements IFDBCopier
{
	private Connection con;
	
	public DBCopier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
