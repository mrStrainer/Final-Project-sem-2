package ControlLayer;

import DBLayer.*;
import ModelLayer.Order;

/**
 * Created by atee on 2017.06.04..
 */
public class OrderControl {
    public void insertOrder(String name, int price, int salePrice, int stock, String brand, String description, String size, String type) throws Exception {
        Order order = new Order();
        try {
            DBConnection.startTransaction();
            IFDBOrder ifdbOrder = new DBOrder();
            ifdbOrder.insertOrder(order);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Order not inserted");
        }
        //insert orderLines
    }
}
