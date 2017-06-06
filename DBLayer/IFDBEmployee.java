package DBLayer;

import ModelLayer.Employee;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBEmployee {
    public int insertEmployee(Employee employee) throws Exception;
}
