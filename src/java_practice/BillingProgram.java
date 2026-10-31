
import java.util.Scanner;

public class BillingProgram {
    public static void main(String[] args) {
        // object creation for scanner
        Scanner sc = new Scanner(System.in);
        // Data
        System.out.print("Customer : ");
        String customer = sc.nextLine();

        System.out.print("Price     :    ");
        double price = sc.nextDouble();

        System.out.print("Quantity   : ");
        int quantity = sc.nextInt();
        sc.nextLine();// nextInt gives leftover /n so it cause item can't print so we remove
                      // sc.nextLine so remove leftover

        System.out.print("Item    : ");
        String item = sc.nextLine();

        // cal
        double total = price * quantity;

        // Header
        System.out.println("------ BILL ------");
        System.out.printf("Customer : %s%n", customer);
        System.out.printf("Item     : %s%n", item);
        System.out.printf("Price    : %.2f%n", price);
        System.out.printf("Quantity : %d%n", quantity);
        System.out.printf("Total    : %.2f%n", total);

        System.out.println("------------------");
        sc.close();

    }
}
