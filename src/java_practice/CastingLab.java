import java.util.Scanner;

public class CastingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A: Marks average
        // System.out.println("Enter three marks separated by spaces: ");
        // int mark1 = sc.nextInt();
        // int mark2 = sc.nextInt();
        // int mark3 = sc.nextInt();

        // Part B: Temperature
        // System.out.println("Enter Celsius: ");
        // int cel = sc.nextInt();

        // Part C: Letter shift
        // System.out.print("Enter the char: ");
        // char c = sc.next().charAt(0);
        // int code = c;

        // Part D: Safe Multiplication
        System.out.println("Enter two Integers: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        // Calculation
        // int sum = mark1 + mark2 + mark3; // Mark average = sum

        // Part2: temperature calculation
        // int F = cel * 9 / 5 + 32;
        // double F1 = (double) cel * 9 / 5 + 32;

        // Part4: product calculation
        long wrongProduct = int1 * int2;
        long rightProduct = (long) int1 * int2;

        // int wrong = sum / 3;
        // double right = (double) sum / 3.0;
        // System.out.println("===== A: MARKS =====");
        // System.out.printf("Wrong average : %d%n", wrong);
        // System.out.printf("Right average : %.2f%n", right);
        // System.out.println("Rounded :" + Math.round(right));
        // temperature print statement
        // System.out.printf("Int result :%d%n", F);
        // System.out.printf("Right result :%.1f%n", F1);
        // Letter print statement
        // System.out.printf("Code of A : %d%n", code);
        // System.out.println("Next letter : " + ((char) (c + 1)));
        // Part D : Product
        System.out.println("Wrong product: " + wrongProduct);
        System.out.println("Right product: " + rightProduct);

        sc.close();

    }
}