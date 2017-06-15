package ModelLayer;

/**
 * Created by atee on 2017.06.06..
 */
public class Restock extends OrderLine {
    private String date;
    private Item item;
    private Supplier supplier;
    
    public Restock(){}

    public Restock(Item item, Supplier supplier, int amount, String date) {
        super(item.getPrice(), amount,3);
        this.date = date;
        this.item = item;
        this.supplier = supplier;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
