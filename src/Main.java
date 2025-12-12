import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1) Add book");
            System.out.println("2) Remove item");
            System.out.println("3) Show basket");
            System.out.println("4) Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Book name: ");
                String name = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Discount (e.g. 0.10 for 10%): ");
                double disc = sc.nextDouble();

                Product book = new Book(name, author, price, disc);
                basket.addItem(book);
                System.out.println("Book Added to Basket!");

            } else if (choice == 2) {
                basket.printItems();
                System.out.print("Index to remove: ");
                int idx = sc.nextInt();
                basket.removeItem(idx);

            } else if (choice == 3) {
                basket.printItems();
                System.out.println("Total: " + basket.getTotal() + " ₺");

            } else if (choice == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }

        sc.close();
    }
}

