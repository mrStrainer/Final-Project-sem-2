package DBLayer;

import ModelLayer.Service;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBService {
    public ArrayList<Service> getAllServices(boolean retriveAssociation);
    public Service findService(int id, boolean retriveAssociation);
    public int insertService(Service service) throws Exception;
    public int delete(int id);
}
