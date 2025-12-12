import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<PriceOperation> items = new ArrayList<>();

    public void addItem(PriceOperation item) {
        items.add(item);
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item Removed from Basket .");
        }
        else  {
            System.out.println(" not found. Please enter a Valid Index.");
        }
    }

    public double getTotal() {
        double total = 0;
        for (PriceOperation item : items) {
            total += item.calculatePrice();
        }
        return total;
    }

    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("Basket is empty.");
            return;
        }
        System.out.println("Items in basket:");
        int i = 0;
        for (PriceOperation item : items) {
            System.out.println(i + " - " + item.toString());
            i++;
        }
    }
}
