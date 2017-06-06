package ControlLayer;

import java.util.ArrayList;

import DBLayer.*;
import ModelLayer.*;

public class ItemControl 
{
	public ItemControl(){}
	//need to insert item, get the auto inc id, use it with the specific item, just as with person/customer..
    // having just tables for the specific items/person would make it way easier tho
	public void insertMemory(String name, int price, int salePrice, int stock, String brand, String description, String size, String type) throws Exception {
	    Memory memory = new Memory(name,price,salePrice,stock,brand, description, size, type);
        try {
            DBConnection.startTransaction();
            DBMemory dbMemory = new DBMemory();
            dbMemory.insertMemory(memory);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Memory not inserted");
        }
    }

	public void insertCamera(String name, int price, int salePrice, int stock, String brand, String description, String type, String resolution) throws Exception {
        Camera camera = new Camera(name,price,salePrice,stock,brand, description, type, resolution);
        try {
            DBConnection.startTransaction();
            DBCamera dbCamera = new DBCamera();
            dbCamera.insertCamera(camera);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Camera not inserted");
        }
    }

	public void insertCopier(String name, int price, int salePrice, int stock, String brand, String description, String type, String speed) throws Exception {
        Copier copier = new Copier(name, price, salePrice, stock, brand, description, type, speed);

        try {
            DBConnection.startTransaction();
            DBCopier dbCopier = new DBCopier();
            dbCopier.insertCopier(copier);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Copier not inserted");
        }
    }

	public void insertPrinter(String name, int price, int salePrice, int stock, String brand, String description, String type, String size) throws Exception {
        Printer printer = new Printer(name,price,salePrice,stock, brand, description, type, size);
        try {
            DBConnection.startTransaction();
            DBPrinter dbPrinter = new DBPrinter();
            dbPrinter.insertPrinter(printer);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Printer not inserted");
        }
    }

	public void insertPhone(String name, int price, int salePrice, int stock, String brand, String description, String ram, String scrSize) throws Exception {
        Phone phone = new Phone(name,price,salePrice,stock, brand, description, ram, scrSize);
        try {
            DBConnection.startTransaction();
            DBPhone dbPhone = new DBPhone();
            dbPhone.insertPhone(phone);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Phone not inserted");
        }
    }

	public void insertOther(String name, int price, int salePrice, int stock, String brand, String description) throws Exception {
        Other other = new Other(name,price,salePrice,stock, brand, description);
        try {
            DBConnection.startTransaction();
            DBOther dbOther = new DBOther();
            dbOther.insertOther(other);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Other not inserted");
        }
    }

    public boolean DeleteMemory(int id) {
        IFDBMemory ifdbMemory = new DBMemory();
        return ifdbMemory.delete(id);
    }

    public boolean DeleteCamera (int id) {
        IFDBCamera ifdbCamera = new DBCamera();
        return ifdbCamera.delete(id);
    }

    public boolean DeleteCopier (int id) {
        IFDBCopier ifdbCopier = new DBCopier();
        return ifdbCopier.delete(id);
    }
    public boolean DeletePrinter (int id) {
        IFDBPrinter ifdbPrinter = new DBPrinter();
        return ifdbPrinter.delete(id);
    }
    public boolean DeletePhone (int id) {
        IFDBPhone ifdbPhone = new DBPhone();
        return ifdbPhone.delete(id);
    }
    public boolean DeleteOther (int id) {
        IFDBOther ifdbOther = new DBOther();
        return ifdbOther.delete(id);
    }
    public Item findItem (int id) {
        IFDBItem ifdbItem = new DBItem();
        return ifdbItem.findItem(id,true);
    }
	
	
	
}
