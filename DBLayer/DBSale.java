package DBLayer;

import ModelLayer.Sale;

/**
 * Created by atee on 2017.06.15..
 */
public class DBSale implements IFDBSale{

    // inserting a sale should insert:
    //  int OrderlineId
    //  int item id --> int itemId = sale.getItem().getId();
    //
    public int insertSale(Sale sale) throws Exception {

    }
}
