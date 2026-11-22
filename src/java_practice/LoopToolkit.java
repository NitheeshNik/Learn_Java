import java.util.Scanner;

public class LoopToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part A: Multiplication table
        System.out.println("===== A: TABLE =====");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }

        // Part B: Number staticstics(sentinel)
        System.out.println("===== B: STATISTICS =====");
        int total = 0;
        int count = 0;
        int max = Integer.MIN_VALUE; // any real number will be bigger
        int min = Integer.MAX_VALUE; // any real number will be smaller

        while (true) {
            System.out.println("Enter number (0 to stop)");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) { // higer then min value stored into max
                max = number;

            }
            if (number < min) { // lower then max it stored into min
                min = number;
            }
            total += number;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers entered");
        } else {
            double average = (double) total / count; // cast before dividing
            System.out.printf("Count    : %d%n", count);
            System.out.printf("Sum      : %d%n", total);
            System.out.printf("Average  : %.2f%n", average);
            System.out.printf("Largest  : %d%n", max);
            System.out.printf("Smallest : %d%n", min);
        }

        // Part C: Menu (repeats until the user chooses 3)
        System.out.println("===== C: MENU =====");
        int choice;
        do {
            System.out.println("1. Check even or odd");
            System.out.println("2. Square of a number");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number: ");
                    int value = sc.nextInt();
                    if (value % 2 == 0) {
                        System.out.println(value + " is even");
                    } else {
                        System.out.println(value + " is odd");
                    }
                }
                case 2 -> {
                    System.out.print("Enter a number: ");
                    int value = sc.nextInt();
                    System.out.println("Square = " + value * value);
                }
                case 3 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);

        // Part D: Triangle pattern
        System.out.println("===== D: TRIANGLE =====");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }
        sc.close();

    }
}