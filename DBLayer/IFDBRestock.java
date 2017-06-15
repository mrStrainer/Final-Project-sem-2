package DBLayer;

import ModelLayer.Restock;

/**
 * Created by atee on 2017.06.15..
 */
public interface IFDBRestock {
    public int insertRestock(Restock restock) throws Exception;
}
