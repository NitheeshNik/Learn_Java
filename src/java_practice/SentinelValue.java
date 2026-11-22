import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            total += number;
            count++;
        }
        System.out.println("Total = " + total + ", Count = " + count);
        sc.close();
    }
}
