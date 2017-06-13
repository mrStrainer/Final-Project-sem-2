package DBLayer;

import ModelLayer.Person;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBPerson {
    public ArrayList<Person> getAllPersons(boolean retriveAssociation);
    public Person findSupplier(int id, boolean retriveAssociation);
    public Person findCustomer(int id, boolean retriveAssociation);
    public int insertPerson(Person person) throws Exception;
    public int delete(int id);
}
