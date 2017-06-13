package ControlLayer;

import DBLayer.*;
import ModelLayer.*;

/**
 * Created by atee on 2017.06.04..
 */
public class OrderControl {
    private ItemControl IC = new ItemControl();

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
        /*if (ol instanceof Sale) {
            if (((Sale) ol).getItem() instanceof Memory) {
                Memory memory = (Memory)((Sale) ol).getItem();
                //IC.insertMemory(memory.get);
            } else if (((Sale) ol).getItem() instanceof Copier) {

            } else if (((Sale) ol).getItem() instanceof Camera) {

            } else if (((Sale) ol).getItem() instanceof Other) {

            } else if (((Sale) ol).getItem() instanceof Phone) {

            } else if (((Sale) ol).getItem() instanceof Printer) {

            }
        } else if (ol instanceof Restock) {

        } else if (ol instanceof Service) {

        }*/
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
