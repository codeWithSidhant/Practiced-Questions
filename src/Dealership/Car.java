package Dealership;

public class Car {
    private String brand;
    private double price;

    public Car(String brand, double price) {
       if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand can not be null or Empty ");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price can not be zero");
        }
        this.brand = brand;
        this.price = price;
    }

    public Car(Car Source) {
        this.brand = Source.brand;
        this.price = Source.price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand){
        if (brand == null || brand.isEmpty()) {
        throw new IllegalArgumentException("Brand can not be null or Empty ");
    }
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if (price <= 0) {
            throw new IllegalArgumentException("Price can not be zero");
        }
        this.price = price;
    }

    public String toString() {
        return "Brand: " + this.brand + "\n"
                + "\tPrice: " + this.price + "\n";
    }


}
