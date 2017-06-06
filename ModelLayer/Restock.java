package ModelLayer;

/**
 * Created by atee on 2017.06.06..
 */
public class Restock extends OrderLine {
    private String date;
    private Item item;

    public Restock(Item item, int amount, String date) {
        super(item.getPrice(), amount);
        this.date = date;
        this.item = item;
    }
}
