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

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<PhotoAlbum> getPas() {
		return pas;
	}

	public void setPas(List<PhotoAlbum> pas) {
		this.pas = pas;
	}

	public int getId() {
		return calendarId;
	}

	public void setId(int calendarId) {
		this.calendarId = calendarId;
	}
}
