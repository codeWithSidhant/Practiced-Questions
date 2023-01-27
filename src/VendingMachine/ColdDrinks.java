package VendingMachine;

public class ColdDrinks {
    private String name;
    private double price;
    private int quantity;

    public ColdDrinks(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if (this.quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be less than zero.");
        }
        if (this.price < 0) {
            throw new IllegalArgumentException("price cannot be less than zero.");
        }
        if (this.name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null/blank.");
        }

    }

    public ColdDrinks(ColdDrinks Source) {
        this.name = Source.name;
        this.price = Source.price;
        this.quantity = Source.quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null/blank.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.price < 0) {
            throw new IllegalArgumentException("price cannot be less than zero.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (this.quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be less than zero.");
        }
        this.quantity = quantity;
    }


    public String toString() {

        return this.name + ": " + this.price + " (" + this.quantity + ")";
    }

}
