package ModelLayer;

public class Sale  extends OrderLine{
    private Item item;
    private Order order;
    private int amount, price saleId;

    public Sale(){}

    public Sale(Item item, Order order, int amount, saleId) 
    {
        this.item = item;
        this.order = order;
        this.amount = amount;
        this.saleId = saleId;
        setPrice();
    }
    
    public void setItem(Item item) 
    {
        this.item = item;
    }
    public void setOrder(Order order)
    {
    	this.order = order;
    }
    public void setamount(int amount)
    {
    	this.amount = amount;
    }
    public void setPrice()
    {
    	price = (item.getPrice()*amount);
    }
    public void setId(int saleId)
    {
    	this.saleId = saleId;
    }
    
    public Order getOrder()
    {
    	return order;
    }
    public Item getItem()
    {
    	return item;
    }
    public int getAmount()
    {
    	return amount;
    }
    public int getPrice()
    {
    	return price;
    }
    public int getId()
    {
    	return saleId;
    }
}
