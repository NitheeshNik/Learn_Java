package java_practice;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int tm = 0;
        int Even = 0;
        int odd = 0;
        System.out.println("How many numbers? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number" + (i + 1) + ": ");
            int current = scan.nextInt();
            sum = sum + current;
            if (current > tm) {
                tm = current;

            }

            if (current % 2 == 0) {
                Even++;
            } else {
                odd++;
            }

        }

        int average = avg(sum, n);
        System.out.println("Average: " + average);
        System.out.println("Largest" + tm);
        System.out.println("Even " + Even);
        System.out.println("Odd " + odd);

    }

    public static int avg(int sum, int n) {
        return sum / n;
    }
}
