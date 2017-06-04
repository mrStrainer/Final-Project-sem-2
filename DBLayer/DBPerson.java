package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPerson implements IFDBPerson
{
	private Connection con;
	
	public DBPerson()
	{
		con = DBConnection.getInstance().getDBcon();
	}

}
