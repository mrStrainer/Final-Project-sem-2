package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBSupplier implements IFDBSupplier
{
	private Connection con;
	
	public DBSupplier()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
