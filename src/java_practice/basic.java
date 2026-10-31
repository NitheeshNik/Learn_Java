public class basic {
    public static void main(String[] args) {
        String name = "Ravi";
        double price = 99.5;
        int qty = 3;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Price: %.2f%n", price); // 99.50
        System.out.printf("Qty: %d%n", qty);
        System.out.printf("%-10s|%5d|%n", name, qty); // left-aligned width 10, right-aligned width 5
        System.out.println("She said \"Hi\"\tand left\\");
        // She said "Hi" and left\
    }
}
