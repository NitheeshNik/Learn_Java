import java.util.Scanner;

public class CastingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A: Marks average
        System.out.println("Enter three marks separated by spaces: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int sum = mark1 + mark2 + mark3;
        int wrong = sum / 3; // java first consider right side so you typecaste first right side this step
                             // can't do that
        double right = (double) sum / 3.0;

        // Part B: Temperature
        System.out.println("Enter Celsius: ");
        int cel = sc.nextInt();
        int F = cel * 9 / 5 + 32; // if you need precesion use double this step can't use double
        double F1 = (double) cel * 9 / 5 + 32;

        // Part C: Letter shift
        System.out.print("Enter the char: ");
        char c = sc.next().charAt(0);
        int code = c; // It show the unicode of the char.

        // Part D: Safe Multiplication
        System.out.println("Enter two Integers: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        long wrongProduct = int1 * int2; // java first consider right side so you typecaste right side first after
                                         // typecause is waste
        long rightProduct = (long) int1 * int2;

        // part A: Marks
        System.out.println("===== A: MARKS =====");
        System.out.printf("Wrong average : %d%n", wrong);
        System.out.printf("Right average : %.2f%n", right);
        System.out.println("Rounded :" + Math.round(right));
        // Part B: Temperature
        System.out.println("===== B: TEMPERATURE =====");
        System.out.printf("Int result    :d%n", F);
        System.out.printf("Right result  :%.1f%n", F1);
        // Part C: Letters
        System.out.println("===== B: TEMPERATURE =====");
        System.out.printf("Code of A     : %d%n", code);
        System.out.println("Next letter   : " + ((char) (c + 1)));// It shows next character of the c.
        // Part D : Product
        System.out.println("===== D: PRODUCT =====");
        System.out.println("Wrong product :" + wrongProduct);
        System.out.println("Right product :" + rightProduct);

        sc.close();

    }
}