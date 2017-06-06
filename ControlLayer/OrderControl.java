package ControlLayer;

import DBLayer.*;
import ModelLayer.*;

/**
 * Created by atee on 2017.06.04..
 */
public class OrderControl {
    public void insertOrder(Order order) throws Exception {

        try {
            DBConnection.startTransaction();
            IFDBOrder ifdbOrder = new DBOrder();
            ifdbOrder.insertOrder(order);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Order not inserted");
        }
        for (OrderLine ol : order.getOrders()) {
            insertOrderLine(ol);
        }
    }
    public void insertOrderLine(OrderLine ol) throws Exception {
        try {
            DBConnection.startTransaction();
            IFDBOrderLine ifdbOrderLine = new DBOrderLine();
            ifdbOrderLine.insertOrderLine(ol);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("OrderLine not inserted");
        }

    }
}
