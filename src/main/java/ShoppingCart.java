import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> array;
    private float totalCost;
    private float shippingCost;

    public ShoppingCart()
    {
        this.array = new ArrayList<Item>();
        this.totalCost = 0;
    }

    public ShoppingCart(float shippingCost)
    {
        this.array = new ArrayList<Item>();
        this.shippingCost = shippingCost;
    }

    public void addItem(Item item)
    {
        this.array.add(item);
    }

    public void calculateTotal()
    {
        for (int i = 0; i < this.array.size(); i++)
        {
            totalCost += (this.array.get(i).getCost() * this.array.get(i).getQuantity());
        }

        if(totalCost < 10)
        {
            totalCost += this.shippingCost;
        }
    }


    public String getTotal()
    {
        return "$ " + this.totalCost;
    }

    public Invoice shipOrder(String name, String streetAddrss, String city, String state, int zip){
        Invoice invoice = new Invoice(name, streetAddrss, city, state, zip, this.array, this.totalCost, this.shippingCost);
        return invoice;
    }

    public ArrayList<Item> getItems(){
        return this.array;
    }
}
