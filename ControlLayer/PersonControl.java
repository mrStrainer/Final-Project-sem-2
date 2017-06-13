package ControlLayer;

import DBLayer.*;
import ModelLayer.*;
import java.util.ArrayList;

public class PersonControl 
{
	public PersonControl(){}
	public void insertPerson(Person person) throws Exception{
        try {
            DBConnection.startTransaction();
            IFDBPerson ifdbPerson = new DBPerson();
            ifdbPerson.insertPerson(person);
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Person not inserted");
        }
    }

	public void insertCustomer(String fName, String lName, String email, String address, int phone, int bDay) throws Exception{
        Customer customer = new Customer(fName,lName,email,address,phone,bDay);
        insertPerson(customer);
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
        Supplier supplier = new Supplier(fName,lName,email,address,phone,bDay);
        insertPerson(supplier);
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
        Employee employee = new Employee(fName,lName,email,address,phone,bDay);
        insertPerson(employee);
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
    public Person findCustomer(int id) throws Exception {
	    Person customer;
        try {
            DBConnection.startTransaction();
            IFDBPerson ifdbPerson = new DBPerson();
            customer  = ifdbPerson.findCustomer(id,false); // again, when true, when false?
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Customer not found");
        }
        return customer;
    }
    public Person findSupplier(int id) throws Exception {
        Person supplier;
        try {
            DBConnection.startTransaction();
            IFDBPerson ifdbPerson = new DBPerson();
            supplier  = ifdbPerson.findSupplier(id,false); // again, when true, when false?
            DBConnection.commitTransaction();
        } catch (Exception e) {
            DBConnection.rollbackTransaction();
            throw new Exception("Supplier not found");
        }
        return supplier;
    }

	public int deletePerson (int id) {
        IFDBPerson ifdbPerson = new DBPerson();
        return ifdbPerson.delete(id);
    }

	public ArrayList<Person> findAllPersons()
    {
        IFDBPerson ifdbPerson = new DBPerson();
        ArrayList<Person> persons = new ArrayList<Person>();
        persons = ifdbPerson.getAllPersons(false);
        return persons;
    }
	
}
