import java.util.Scanner;

public class numberToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A : Seconds converter
        System.out.print("Enter seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600; // why 3600 : 1h = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 6;

        // Part B: Digits of a 3-digit number
        System.out.println("Enter 3-digit number: ");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int middleDigit = (number / 10) % 10; // or (number % 100) / 10
        int lastDigit = number % 10;
        int sum = firstDigit + middleDigit + lastDigit;
        String reverse = lastDigit + "" + middleDigit + "" + firstDigit;

        // Part C : Boolean checks
        int even = number % 2;
        boolean check = number >= 100 && number <= 999;
        boolean division = number % 3 == 0 || number % 5 == 0;
        System.out.printf("%b%n", division);

        // Part D: Trace the operators
        int p = 5;
        int q = p++ + ++p;
        System.out.println("p = " + p + ", q = " + q);// My prediction p = 7, q = 12

        int m = 10;
        m -= 3;
        m *= 2;
        m %= 5;
        System.out.println("m = " + m); // m = 4

        // Part:A
        System.out.println("===== A: SECONDS =====");
        System.out.printf("%d h %d m %d s%n", hours, minutes, seconds);
        // Part:B
        System.out.println("===== B: DIGITS =====");
        System.out.printf("Digit sum : %d%n", sum);
        System.out.printf("Reversed : %s%n", reverse);
        // Part : C
        System.out.printf("Even                 : %d%n", even);
        System.out.printf("Between 100 and 999  : %b%n", check);
        System.out.printf("Divisible by 3 or 5  : %b%n", division);
        // Part:D
        // p = 7, q = 12
        // m = 4

        sc.close();
    }
}