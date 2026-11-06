import java.util.Scanner;

public class NumberToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A : Seconds converter
        System.out.print("Enter seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600; // why 3600 : 1h = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Part B: Digits of a 3-digit number
        System.out.println("Enter 3-digit number: ");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int middleDigit = (number / 10) % 10; // or (number % 100) / 10
        int lastDigit = number % 10;
        int sum = firstDigit + middleDigit + lastDigit;
        int reversed = lastDigit * 100 + middleDigit * 10 + firstDigit;
        // String reverse = lastDigit + "" + middleDigit + "" + firstDigit; -- also use
        // this method alternative to reverse

        // Part C : Boolean checks
        boolean isEven = number % 2 == 0;
        boolean isInRange = number >= 100 && number <= 999;
        boolean isDivisibleBy3Or5 = number % 3 == 0 || number % 5 == 0;
        System.out.printf("%b%n", isDivisibleBy3Or5);

        // Part D: Trace the operators
        int p = 5;
        int q = p++ + ++p;

        int m = 10;
        m -= 3;
        m *= 2;
        m %= 5;

        // Part:A
        System.out.println("===== A: SECONDS =====");
        System.out.printf("%d h %d m %d s%n", hours, minutes, seconds);
        // Part:B
        System.out.println("===== B: DIGITS =====");
        System.out.printf("Digit sum : %d%n", sum);
        System.out.printf("Reversed : %s%n", reversed);
        // Part : C
        System.out.println("===== C: CHECKS =====");
        System.out.printf("isEven                 : %b%n", isEven);
        System.out.printf("Between 100 and 999  : %b%n", isInRange);
        System.out.printf("Divisible by 3 or 5  : %b%n", isDivisibleBy3Or5);
        // Part:D
        System.out.println("===== D: TRACE =====");
        System.out.println("p = " + p + ", q = " + q);// My prediction p = 7, q = 12
        System.out.println("m = " + m); // m = 4

        // p = 7, q = 12
        // m = 4

        sc.close();
    }
}