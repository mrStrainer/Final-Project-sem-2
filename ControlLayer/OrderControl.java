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
            insertOrderLine(ol,order.getId());
        }
    }
    public void insertOrderLine(OrderLine ol, int orderId) throws Exception {
        if (ol.getType() == 0) {
            insertSale(ol);
        } else if (ol.getType() == 1) {
            insertService(ol);
        } else if (ol.getType() == 2) {
            insertPhotoAlbum(ol);
        } else if (ol.getType() == 3) {
            insertRestock(ol);
        }
        try {
            DBConnection.startTransaction();
            IFDBOrderLine ifdbOrderLine = new DBOrderLine();
            ifdbOrderLine.insertOrderLine(ol, orderId);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("OrderLine not inserted");
        }

    }

    public void insertSale(OrderLine ol) throws Exception{
        Sale sale = (Sale) ol;
        try {
            DBConnection.startTransaction();
            IFDBSale ifdbSale = new DBSale();
            ifdbSale.insertSale(sale);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Sale not inserted");
        }
    }

    public void insertService(OrderLine ol) throws Exception{
        Service service = (Service) ol;
        try {
            DBConnection.startTransaction();
            IFDBService ifdbService = new DBService();
            ifdbService.insertService(service);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Service not inserted");
        }
    }

    public void insertPhotoAlbum(OrderLine ol) throws Exception{
        PhotoAlbum photoAlbum = (PhotoAlbum) ol;
        try {
            DBConnection.startTransaction();
            IFDBPhotoAlbum ifdbPhotoAlbum = new DBPhotoAlbum();
            ifdbPhotoAlbum.insertPA(photoAlbum);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Photo Album not inserted");
        }
    }

    public void insertRestock(OrderLine ol) throws Exception{
        Restock restock = (Restock) ol;
        try {
            DBConnection.startTransaction();
            IFDBRestock ifdbRestock = new DBRestock();
            ifdbRestock.insertRestock(restock);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Restock not inserted");
        }
    }


}
