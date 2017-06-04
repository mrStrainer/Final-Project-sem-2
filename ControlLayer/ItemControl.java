package ControlLayer;

import java.util.ArrayList;

import DBLayer.*;
import ModelLayer.*;

public class ItemControl 
{
	public ItemControl(){}
	
	public void insertItem(String fName, String lName, String email, String address, int phone, int bDay, int cId) throws Exception{
		Item customer = new Item();


        try {
            DBConnection.startTransaction();
            DBCustomer dbCustomer = new DBCustomer();
            dbCustomer.insertCustomer(customer);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Person not inserted");
        }
    }
	
	
	
}
