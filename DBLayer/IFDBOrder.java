package DBLayer;

import ModelLayer.Copier;
import ModelLayer.Order;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBOrder {
    public ArrayList<Order> getAllOrders(boolean retriveAssociation);
    public int insertOrder(Order order) throws Exception;
    public int delete(int id);

}
