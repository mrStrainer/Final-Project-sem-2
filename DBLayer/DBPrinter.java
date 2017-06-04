package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPrinter implements IFDBPrinter
{
	private Connection con;
	
	public DBPrinter()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
