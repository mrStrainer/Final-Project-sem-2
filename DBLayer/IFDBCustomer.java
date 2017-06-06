package DBLayer;

import ModelLayer.Customer;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBCustomer {
    public int insertCustomer(Customer customer) throws Exception;
}
