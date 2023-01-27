package MovieStore;

public class MovieClass {

    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double renttalPrice;
    private boolean availability;

    public MovieClass(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equals("BlueRay") ? 4.34 : 1.2;
        this.renttalPrice = format.equals("BlueRay") ? 1.34 : 0.92;
        this.availability = true;
        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalArgumentException("Name cane not be left Blank or null");
        }
        if (!(this.format.equals("DVD") || this.format.equals("BlueRay"))) {
            throw new IllegalArgumentException("Formy must be in DVD or BlueRay");
        }
        if (this.rating == 0 || this.rating > 10) {
            throw new IllegalArgumentException("Rating cannot be zero or greatr than 10");
        }
    }

    public MovieClass(MovieClass Source) {
        this.name = Source.name;
        this.format = Source.format;
        this.rating = Source.rating;
        this.sellingPrice = Source.sellingPrice;
        this.renttalPrice = Source.renttalPrice;
        this.availability = Source.availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalArgumentException("Name cane not be left Blank or null");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (!(this.format.equals("DVD") || this.format.equals("BlueRay"))) {
            throw new IllegalArgumentException("Formy must be in DVD or BlueRay");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (this.rating == 0 || this.rating > 10) {
            throw new IllegalArgumentException("Rating cannot be zero or greatr than 10");
        }
        this.rating = rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getRenttalPrice() {
        return renttalPrice;
    }

    public void setRenttalPrice(double renttalPrice) {
        this.renttalPrice = renttalPrice;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String toString() {
        return "\t Name: " + this.name + "\n" +
                "\t Format: " + this.format + "\n" +
                "\t Rating: " + this.rating + " IMDB\n" +
                "\t Selling Price: " + this.sellingPrice + "$\n" +
                "\t Rental Price: " + this.renttalPrice + "$\n" +
                "\t Availability: " + (this.availability ? "In Stock" : "Rented");
    }
}
