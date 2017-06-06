package DBLayer;

import ModelLayer.Item;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBItem {
    public Item findItem(int id, boolean retriveAssociation);

    public ArrayList<Item> getAllItems(boolean retriveAssociation);

    public int insertItem(Item item) throws Exception;
    public int delete(int id);

}

