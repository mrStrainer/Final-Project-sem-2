package DBLayer;

import ModelLayer.*;
import java.sql.*;
import java.util.*;

public class DBPhotoAlbum 
{
	private Connection con;
	
	public DBPhotoAlbum()
	{
		con = DBConnection.getInstance().getDBcon();
	}
}
