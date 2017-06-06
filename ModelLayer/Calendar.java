package ModelLayer;

import java.util.*;

public class Calendar 
{
	private static int calendarCount = 0;
	private List<Service> services;
	private List<PhotoAlbum> pas;
	private int calendarId;
	
	public Calendar()
	{
		services = new ArrayList<>();
		pas = new ArrayList<>();
		calendarCount++;
		this.calendarId = calendarCount;
	}
	
	public void addService(Service service)
	{
		services.add(service);
	}
	
	public List<Service> getServices()
	{
		return services;
	}
	
	public void addPA(PhotoAlbum pa)
	{
		pas.add(pa);
	}
	
	public List<PhotoAlbum> getPAs()
	{
		return pas;
	}
}
