public class Book extends Product {

    private String author;
    private double discountRate;

    public Book(String name, String author, double price, double discountRate) {
        super(name, price);
        this.author = author;
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice() {
        return price * (1 - discountRate);
    }

    @Override
    public String toString() {
        return "Book: " + name + " by " + author + " - " + calculatePrice() + " ₺";
    }
}
