package ModelLayer;

import java.util.*;

public class Calendar 
{
	private List<Service> services;
	private List<PhotoAlbum> pas;
	
	public Calendar()
	{
		services = new ArrayList<>();
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
