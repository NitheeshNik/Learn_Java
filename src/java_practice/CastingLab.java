import java.util.Scanner;

public class CastingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A: Marks average
        System.out.print("Enter three marks separated by spaces: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int sum = mark1 + mark2 + mark3;
        int wrong = sum / 3; // int / int = integer division, decimal part is lost
        double right = (double) sum / 3.0;

        // Part B: Temperature
        System.out.print("Enter Celsius: ");
        int celsius = sc.nextInt();
        int fahrenheitInt = celsius * 9 / 5 + 32; // 37 * 9 / 5 uses integer division, so 66.6 becomes 66
        double fahrenheitExact = (double) celsius * 9 / 5 + 32;

        // Part C: Letter shift
        System.out.print("Enter the char: ");
        char letter = sc.next().charAt(0);
        int code = letter; // It show the unicode of the char.

        // Part D: Safe Multiplication
        System.out.print("Enter two Integers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        long wrongProduct = first * second; // multiplied as int first, overflows before it becomes long
        long rightProduct = (long) first * second;

        // part A: Marks
        System.out.println("===== A: MARKS =====");
        System.out.printf("Wrong average : %d%n", wrong);
        System.out.printf("Right average : %.2f%n", right);
        System.out.println("Rounded       : " + (int) Math.round(right));
        // Part B: Temperature
        System.out.println("===== B: TEMPERATURE =====");
        System.out.printf("Int result    :%d%n", fahrenheitInt);
        System.out.printf("Right result  :%.1f%n", fahrenheitExact);
        // Part C: Letters
        System.out.println("===== C: LETTERS =====");
        System.out.printf("Code of %letter     : %d%n", letter, code);
        System.out.println("Next letter   : " + ((char) (letter + 1)));// It shows next character of the letter.
        // Part D : Product
        System.out.println("===== D: PRODUCT =====");
        System.out.println("Wrong product :" + wrongProduct);
        System.out.println("Right product :" + rightProduct);

        sc.close();

    }
}