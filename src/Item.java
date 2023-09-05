import java.text.DecimalFormat;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity)

    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getExtendedPrice()
    {
        double extendedPrice;
        extendedPrice = quantity * price;
        return extendedPrice;
    }

    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        double extendedPrice = price * quantity;
        return "Item " + "name='" + name + " " + ", unit price=$" + df.format(price) +
                ", quantity=" + quantity + ", extended price= $" + df.format(getExtendedPrice());
    }
}
