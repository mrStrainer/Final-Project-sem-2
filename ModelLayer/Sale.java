package ModelLayer;

/**
 * Created by atee on 2017.06.06..
 */
public class Sale  extends OrderLine{
    private Item item;

    public Sale(Item item, int amount) {
        super(item.getPrice(),amount);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
