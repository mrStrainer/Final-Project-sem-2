package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBMemory implements IFDBMemory
{
	private Connection con;
	
	public DBMemory()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
