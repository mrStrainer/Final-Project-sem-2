package DBLayer;

import ModelLayer.OrderLine;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBOrderLine {
    public ArrayList<OrderLine> getAllOrderLines(boolean retriveAssociation);
    public int insertOrderLine(OrderLine ol, int orderId) throws Exception;
    public int delete(int id);
}
