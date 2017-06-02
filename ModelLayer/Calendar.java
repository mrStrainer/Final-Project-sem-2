package ModelLayer;

import java.util.*;

public class Calendar 
{
	private List<Service> services;
	
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
}
