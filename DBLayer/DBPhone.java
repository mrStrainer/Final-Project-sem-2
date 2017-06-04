package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPhone implements IFDBPhone
{
	private Connection con;
	
	public DBPhone()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
