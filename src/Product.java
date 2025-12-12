public class Product implements PriceOperation {

    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + calculatePrice() + " ₺";
    }
}
