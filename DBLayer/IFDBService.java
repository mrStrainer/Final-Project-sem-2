package DBLayer;

import ModelLayer.Supplier;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBService {
    public int insertSupplier(Supplier supplier) throws Exception;
}
