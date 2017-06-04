package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBCalendar implements IFDBCalendar
{
	private Connection con;
	
	public DBCalendar()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
