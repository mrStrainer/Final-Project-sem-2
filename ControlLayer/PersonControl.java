package ControlLayer;

import java.util.ArrayList;

import DBLayer.*;
import ModelLayer.*;

public class PersonControl 
{
	public PersonControl(){}
	public void insertCustomer(String fName, String lName, String email, String address, int phone, int bDay) throws Exception{
        Customer customer = new Customer();
        customer.setfName(fName);
        customer.setlName(lName);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setbDay(bDay);

        try {
            DBConnection.startTransaction();
            DBCustomer dbCustomer = new DBCustomer();
            dbCustomer.insertCustomer(customer);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Customer not inserted");
        }
    }
	
	public void insertSupplier(String fName, String lName, String email, String address, int phone, int bDay) throws Exception{
        Supplier supplier = new Supplier();
        supplier.setfName(fName);
        supplier.setlName(lName);
        supplier.setEmail(email);
        supplier.setAddress(address);
        supplier.setPhone(phone);
        supplier.setbDay(bDay);

        try {
            DBConnection.startTransaction();
            DBSupplier dbSupplier = new DBSupplier();
            dbSupplier.insertSupplier(supplier);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Supplier not inserted");
        }
    }
	
	public void insertEmployee(String fName, String lName, String email, String address, int phone, int bDay) throws Exception{
        Employee employee = new Employee();
        employee.setfName(fName);
        employee.setlName(lName);
        employee.setEmail(email);
        employee.setAddress(address);
        employee.setPhone(phone);
        employee.setbDay(bDay);

        try {
            DBConnection.startTransaction();
            DBEmployee dbEmployee = new DBEmployee();
            dbEmployee.insertEmployee(employee);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Employee not inserted");
        }
    }
	
	public Person findPerson (int id) {
        IFDBPerson ifdbPerson = new DBPerson();
        return ifdbPerson.findPerson(id,true);
    }
	
	public boolean DeleteCustomer (int id) {
        IFDBCustomer ifdbCustomer = new DBCustomer();
        return ifdbCustomer.delete(id);
    }

    public boolean DeleteSupplier (int id) {
        IFDBSupplier ifdbSupplier = new DBSupplier();
        return ifdbSupplier.delete(id);
    }

    public boolean DeleteEmployee (int id) {
        IFDBEmployee ifdbEmployee = new DBEmployee();
        return ifdbEmployee.delete(id);
    }
	
	public ArrayList<Person> findAllPersons()
    {
        IFDBPerson dbPerson = new DBPerson();
        ArrayList<Person> persons = new ArrayList<Person>();
        persons = dbPerson.getAllPersons(false);
        return persons;
    }
	
}
