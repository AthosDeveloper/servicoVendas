package store;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void addProduct (int quantity){
        setQuantity(getQuantity() + quantity);
    }
    public void removeProduct(int quantity){
        setQuantity(getQuantity() - quantity);
    }
public double totalValueInStock(){

return getPrice() * getQuantity();
}
    @Override
    public String toString() {
        return "Name: " + this.getName() + " quantity: " + this.getQuantity() + " price: " + this.getPrice() + " total value in stock: " + this.totalValueInStock();
    }
}
