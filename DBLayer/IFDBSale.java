package DBLayer;

import ModelLayer.Sale;

/**
 * Created by atee on 2017.06.15..
 */
public interface IFDBSale {
    public int insertSale(Sale sale) throws Exception;
}
